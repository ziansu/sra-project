public boolean equalsTo(float azimmuth, float pitch, float roll, long timestamp) {
    return (((this.azimuth) == (azimuth)) && ((this.pitch) == pitch)) && ((this.timestamp) == timestamp);
}