protected void calculateMinMax() {
    for (ch.eonum.pipeline.core.Instance inst : dataset) {
        double value = ("0".equals(inst.label)) ? inst.getResult("result") : -(inst.getResult("result"));
        if (value > (max))
            max = value;
        
        if (value < (min))
            min = value;
        
    }
}