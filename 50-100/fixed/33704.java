public static com.chilliworks.chillisource.coreutils.Matrix4 createTranslation(com.chilliworks.chillisource.coreutils.Vector3 in_translation) {
    return new com.chilliworks.chillisource.coreutils.Matrix4(1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, in_translation.getX(), in_translation.getY(), in_translation.getZ(), 1.0);
}