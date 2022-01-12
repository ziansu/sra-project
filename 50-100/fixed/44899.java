public boolean positionChecker(java.lang.String positionList, int position) {
    boolean flag = false;
    java.util.List<java.lang.String> tmp;
    tmp = positionParser(positionList);
    for (java.lang.String item : tmp) {
        if (item.equals(java.lang.String.valueOf(position))) {
            flag = true;
            break;
        }
    }
    return flag;
}