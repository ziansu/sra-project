@java.lang.Override
public void setTitle(int titleId) {
    super.setTitle(titleId);
    if (((title) != null) || ((getDefualtToolbar()) != null)) {
        getDefualtToolbar().setTitle(titleId);
    }
}