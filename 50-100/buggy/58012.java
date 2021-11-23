private void append(java.lang.StringBuilder builder, databus.event.mysql.Column column) {
    if (column.isString()) {
        if (null == (column.value())) {
            builder.append("NULL");
        }else {
            builder.append("'");
            builder.append(column.value().replace("'", "\\\'"));
            builder.append("'");
        }
    }else {
        builder.append(column);
    }
}