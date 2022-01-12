public static ncsa.hdf.object.h5.H5Datatype getType(java.lang.String type) {
    if (type.contains("java.lang.String")) {
        return new ncsa.hdf.object.h5.H5Datatype(ncsa.hdf.object.Datatype.CLASS_STRING, 1024, (-1), (-1));
    }
    try {
        int dataType = HDFJavaUtils.DataTypeUtils.getDataType(type);
        if (dataType == (-1))
            return null;
        
        return new ncsa.hdf.object.h5.H5Datatype(dataType);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}