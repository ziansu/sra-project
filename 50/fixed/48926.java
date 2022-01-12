protected void setupValueEntryBox(final com.stcarlso.goece.ui.AbstractEntryBox<?> box) {
    box.setOnCalculateListener(this);
    registerAdjustable(box);
}