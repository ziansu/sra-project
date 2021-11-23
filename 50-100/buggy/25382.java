final void copy(org.joml.Matrix4f src, org.joml.Matrix4f dest) {
    org.joml.MemUtil.MemUtilUnsafe.UNSAFE.putOrderedLong(dest, org.joml.MemUtil.MemUtilUnsafe.Matrix4f_m00, org.joml.MemUtil.MemUtilUnsafe.UNSAFE.getLong(src, org.joml.MemUtil.MemUtilUnsafe.Matrix4f_m00));
    for (int i = 1; i < 8; i++) {
        org.joml.MemUtil.MemUtilUnsafe.UNSAFE.putLong(dest, ((org.joml.MemUtil.MemUtilUnsafe.Matrix4f_m00) + (i << 3)), org.joml.MemUtil.MemUtilUnsafe.UNSAFE.getLong(src, ((org.joml.MemUtil.MemUtilUnsafe.Matrix4f_m00) + (i << 3))));
    }
}