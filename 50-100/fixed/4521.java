public static final int getSignedInteger(int o1, int o2, int o3, int o4) {
    return ((((o1 & 255) << 24) | ((o2 & 255) << 16)) | ((o3 & 255) << 8)) | (o4 & 255);
}