public int absCount(long start, long end, long step) {
    double c = (end - start) / step;
    int ic = ((int) (c));
    if (c < ic)
        return ic + 1;
    else
        return ic;
    
}