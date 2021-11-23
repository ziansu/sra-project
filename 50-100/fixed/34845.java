@java.lang.Override
public java.lang.String getUiElementType(java.lang.String columnTypeName) {
    switch (columnTypeName) {
        case "varchar" :
        case "varchar_ignorecase" :
        case "bpchar" :
            return "text";
        case "tsvector" :
        case "text" :
            return "textarea";
        case "date" :
        case "timestamp" :
            return "date";
        case "integer" :
        case "int4" :
        case "int" :
        case "int2" :
        case "serial" :
            return "number";
    }
    return columnTypeName;
}