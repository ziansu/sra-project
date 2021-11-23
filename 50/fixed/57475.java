private float parentOpacity() {
    return (parent) != null ? (parent.getOpacity()) * (parent.parentOpacity()) : 1.0F;
}