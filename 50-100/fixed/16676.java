public static int getDataTypeSize(se.lu.nateko.cp.data.formats.bintable.DataType dt) {
    switch (dt) {
        case INT :
            return 4;
        case FLOAT :
            return 4;
        case DOUBLE :
            return 8;
        case SHORT :
            return 2;
        case CHAR :
            return 2;
        case BYTE :
            return 1;
        case STRING :
            return 4;
        default :
            throw se.lu.nateko.cp.data.formats.bintable.Utils.unsupportedDatatypeException(dt);
    }
}