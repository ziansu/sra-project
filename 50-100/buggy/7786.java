private int setListBottom(java.util.List listToSetBottomOf, int listTopPos) {
    int listBottom = 0;
    if ((listToSetBottomOf.size()) > 0) {
        if ((listToSetBottomOf.size()) < 10) {
            listBottom = listToSetBottomOf.size();
        }else {
            listBottom = listTopPos + 11;
        }
    }
    return listBottom;
}