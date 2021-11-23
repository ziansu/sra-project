public <T> boolean checkBounds(T[] values) {
    if (values == null)
        return false;
    
    return !(intersection(new com.std4453.jbc.util.Interval(0, values.length)).isEmpty());
}