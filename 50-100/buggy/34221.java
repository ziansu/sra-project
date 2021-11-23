public java.lang.String[] formatWhereParams(java.lang.Object... whereArgs) {
    java.lang.String[] newWhereArgs = new java.lang.String[whereArgs.length];
    for (int x = 0; x < (whereArgs.length); x++)
        newWhereArgs[x] = com.easylite.ConverterUtil.convertParamValue(whereArgs[x]);
    
    return newWhereArgs;
}