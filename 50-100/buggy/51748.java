public java.lang.String getDate() {
    for (int i = 0; i < (list.size()); i++) {
        if ((correctFirstNum(list.get(i).substring(0, 3))) && (correctLength(list.get(i)))) {
            return list.get(i);
        }
    }
    return calandar.getInstance().getTime().toString();
}