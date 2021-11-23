@java.lang.Override
public MN.Sample sample() {
    MN.Sample s = new MN.Sample();
    for (int i = 0; i < (probs.size()); i++) {
        double val = probs.get(i).sample();
        s.setSampledValue(probs.get(i).getNode(), val);
    }
    return s;
}