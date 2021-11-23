public float toDays() {
    float days = (((((float) (this.toMillis())) * 1000.0F) * 60.0F) * 60.0F) * 24.0F;
    return days;
}