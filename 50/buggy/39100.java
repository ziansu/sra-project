public java.lang.String getRandom(java.util.List<java.lang.String> getList) {
    int index = Main.randNum(0, getList.size());
    return getList.get(index);
}