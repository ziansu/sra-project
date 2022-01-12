public void remove(java.lang.String key) {
    com.cdoframework.cdolib.data.cdo.Field objExt = hmItem.remove(key);
    if (((objExt != null) && ((objExt.getType().getDataType()) == (com.cdoframework.cdolib.base.DataType.FILE_TYPE))) && (!(key.contains(".")))) {
        (fileCount)--;
    }
}