public float getVolume(int voice) {
    return getInt(((se.tube42.drum.data.Program.PARAM_VOLUME_n) + voice));
}