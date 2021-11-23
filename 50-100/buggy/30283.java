public org.apache.carbondata.core.metadata.datatype.DataType convertType(java.lang.String type) {
    switch (type.toLowerCase()) {
        case "int" :
            return org.apache.carbondata.core.metadata.datatype.DataType.INT;
        case "string" :
            return org.apache.carbondata.core.metadata.datatype.DataType.STRING;
        case "double" :
            return org.apache.carbondata.core.metadata.datatype.DataType.DOUBLE;
        case "float" :
            return org.apache.carbondata.core.metadata.datatype.DataType.FLOAT;
        case "timestamp" :
            return org.apache.carbondata.core.metadata.datatype.DataType.TIMESTAMP;
        case "decimal" :
            return org.apache.carbondata.core.metadata.datatype.DataType.DECIMAL;
        case "date" :
            return org.apache.carbondata.core.metadata.datatype.DataType.DATE;
        case "boolean" :
            return org.apache.carbondata.core.metadata.datatype.DataType.BOOLEAN;
        case "long" :
            return org.apache.carbondata.core.metadata.datatype.DataType.LONG;
        default :
            return org.apache.carbondata.core.metadata.datatype.DataType.NULL;
    }
}