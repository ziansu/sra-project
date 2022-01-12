private short[] downsample441to16(short[] input) {
    float[] interpolated = this.interpolate(input);
    short[] filtered = this.lowPassFilter(interpolated);
    short[] output = this.downsampleByN(filtered, 3);
    return output;
}