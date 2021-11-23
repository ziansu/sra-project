public boolean find(int value) {
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : map.entrySet()) {
        int num = entry.getKey();
        int diff = value - num;
        if (map.containsKey(diff)) {
            if (diff == num) {
                return (map.get(num)) > 1;
            }else {
                return true;
            }
        }else {
            return false;
        }
    }
    return false;
}