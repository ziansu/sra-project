public boolean find(int value) {
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : map.entrySet()) {
        int num = entry.getKey();
        int diff = value - num;
        if (map.containsKey(diff)) {
            if (diff == num) {
                if ((map.get(num)) > 1) {
                    return true;
                }
            }else {
                return true;
            }
        }
    }
    return false;
}