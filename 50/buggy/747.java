public int get(int power) {
    java.lang.Integer res = ((java.lang.Integer) (powerMap.get(power)));
    if (res != null)
        return res;
    
    return 0;
}