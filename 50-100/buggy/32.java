public static java.util.ArrayList<java.lang.String> getMostFiveItem(java.util.Map<java.lang.String, java.lang.Integer> map) {
    int i = 0;
    java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String s : map.keySet()) {
        if (i < 5) {
            list.add(s);
            i++;
        }else {
            break;
        }
    }
    return list;
}