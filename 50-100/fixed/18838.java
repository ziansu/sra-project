public boolean equalsTo(float azimuth, float pitch, float roll, long timestamp) {
    return ((((this.azimuth) == azimuth) && ((this.pitch) == pitch)) && ((this.timestamp) == timestamp)) && ((this.roll) == roll);
}