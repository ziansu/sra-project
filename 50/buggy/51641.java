public boolean put(int power, int value) {
    if ((powerMap.put(power, value)) != null)
        return true;
    
    return false;
}