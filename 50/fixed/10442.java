public float toHours() {
    float hours = ((((float) (this.toMillis())) / 1000.0F) / 60.0F) / 60.0F;
    return hours;
}