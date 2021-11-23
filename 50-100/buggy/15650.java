@java.lang.Override
public float decibelToFloat(float dB) {
    float sample;
    if (dB != (-144.0F)) {
        sample = ((float) (java.lang.Math.pow(10, (dB / 20))));
    }else {
        sample = 0.0F;
    }
    return sample;
}