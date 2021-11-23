private float parentOpacity() {
    org.meganekkovr.Entity parent = getParent();
    return parent != null ? parent.getOpacity() : 1.0F;
}