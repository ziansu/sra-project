@java.lang.Override
public final void setTitleAt(int index, java.lang.String title) {
    java.lang.String extra = getExtraTitleAt(index);
    if (extra != null) {
        if ((title == null) || ((title.length()) == 0)) {
            title = extra;
        }else {
            title += " " + extra;
        }
    }
    super.setTitleAt(index, title);
}