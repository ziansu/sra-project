public float toMinutes() {
    float minutes = (((float) (this.toMillis())) * 1000.0F) * 60.0F;
    return minutes;
}