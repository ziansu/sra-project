public int getStatusByMD5(com.starbase.util.MD5 md5) {
    java.lang.String md5sum = itemProperties.getProperty(propertyKeys.FILE_MD5_CHECKSUM);
    if (md5sum.equalsIgnoreCase(md5.toHexString())) {
        return Status.CURRENT;
    }
    return Status.UNKNOWN;
}