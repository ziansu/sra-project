@java.lang.Override
public MN.Sample sample() {
    MN.Sample s = new MN.Sample();
    for (int i = 0; i < (probs.length); i++) {
        double val = probs[i].sample();
        s.setSampledValue(probs[i].getNode(), val);
    }
    return s;
}