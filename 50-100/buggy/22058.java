@java.lang.Override
public float floatToDecibel(float sample) {
    float db;
    sample = java.lang.Math.abs(sample);
    if (sample != 0.0F) {
        db = ((float) (20.0F * (java.lang.Math.log10(sample))));
    }else {
        db = -144.0F;
    }
    return db;
}