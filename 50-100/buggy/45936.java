@java.lang.Override
public int compare(com.example.mjk.camera2videoimage.Size lhs, com.example.mjk.camera2videoimage.Size rhs) {
    return java.lang.Long.signum(((((long) (lhs.getWidth())) * (lhs.getHeight())) / (((long) (rhs.getWidth())) * (rhs.getHeight()))));
}