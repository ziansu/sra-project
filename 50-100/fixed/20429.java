public void addPoint(float value, int cls) {
    int[] pd = histogram.get(value);
    if (pd != null) {
        (pd[cls])++;
    }else {
        pd = new int[cd.length];
        (pd[cls])++;
        histogram.put(value, pd);
    }
    (cd[cls])++;
    if (value > (end))
        end = value;
    
}