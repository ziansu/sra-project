@java.lang.Override
public void setHidden() {
    if ((tvLayout) != null) {
        java.lang.Integer bckgrndID = ((java.lang.Integer) (tvLayout.getTag(textViewLayoutID)));
        if ((bckgrndID != null) && (bckgrndID == (stringID))) {
            tvLayout.setBackgroundResource(0);
            tvLayout.removeAllViews();
        }
    }
}