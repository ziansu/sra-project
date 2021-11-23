public com.stedi.randomimagegenerator.Rig.Builder setWidthRange(int from, int to, int step) {
    if (step <= 0)
        throw new java.lang.IllegalArgumentException("step must be > 0");
    
    if ((from <= 0) || (to <= 0))
        throw new java.lang.IllegalArgumentException("from to must be > 0");
    
    p.widthFrom = from;
    p.widthTo = to;
    p.useWidthRange = true;
    p.count = 1;
    return this;
}