public java.util.List<java.lang.String> readBinaryWatch(int num) {
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    for (int i = 0; (i <= num) && (i < 5); i++) {
        for (java.lang.String hour : possibleHours(i)) {
            for (java.lang.String minute : possibleMinutes((num - i))) {
                list.add(((hour + ":") + minute));
            }
        }
    }
    return list;
}