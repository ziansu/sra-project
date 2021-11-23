public static java.util.Map<java.lang.String, java.lang.Integer> getMostFiveItem(java.util.Map<java.lang.String, java.lang.Integer> map) {
    int i = 0;
    java.util.Map<java.lang.String, java.lang.Integer> list = new java.util.HashMap<java.lang.String, java.lang.Integer>();
    for (java.lang.String s : map.keySet()) {
        java.lang.System.out.println(s);
        if (i < 5) {
            list.put(s, map.get(s));
            i++;
        }else {
            break;
        }
    }
    return list;
}