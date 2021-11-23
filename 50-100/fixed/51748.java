public java.lang.String getDate(java.util.List<java.lang.String> list) {
    for (int i = 0; i < (list.size()); i++) {
        if ((correctFirstNum(list.get(i).substring(0, 3))) && (correctLength(list.get(i)))) {
            return list.get(i);
        }
    }
    return calandar.getInstance().getTime().toString();
}