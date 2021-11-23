private java.lang.StringBuffer getWriteBuffer(java.lang.Object reflectModel, cn.ytxu.http_wrapper.template_engine.parser.statement.record.retain.RetainModel retain, java.util.List<cn.ytxu.http_wrapper.template.expression.ExpressionRecord> records) {
    java.lang.StringBuffer buffer = new java.lang.StringBuffer();
    for (cn.ytxu.http_wrapper.template.expression.ExpressionRecord record : records) {
        try {
            buffer.append(record.getWriteBuffer(reflectModel, retain));
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    return buffer;
}