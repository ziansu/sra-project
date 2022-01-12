@java.lang.Override
public java.lang.String getPreviousViewName() {
    if ((viewList.size()) < 2) {
        return "";
    }
    return viewList.get(((viewList.size()) - 2));
}