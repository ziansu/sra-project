private java.lang.String preValuesSql(java.lang.String[] values) {
    java.lang.String valuesSql = "VALUES ( null, ";
    for (int i = 0; i < (values.length); i++) {
        if (i != 0)
            valuesSql += ", ";
        
        java.lang.String value = values[i];
        valuesSql += value;
    }
    valuesSql += " );";
    show(valuesSql);
    return valuesSql;
}