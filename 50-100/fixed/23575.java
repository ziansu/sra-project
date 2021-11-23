@java.lang.Override
public final void setTitleAt(int index, @org.jetbrains.annotations.Nullable
java.lang.String title) {
    java.lang.String extra = getExtraTitleAt(index);
    if (extra != null) {
        if ((title == null) || (title.isEmpty())) {
            title = extra;
        }else {
            title += " " + extra;
        }
    }
    super.setTitleAt(index, title);
}