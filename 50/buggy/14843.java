public void activateListItem(android.widget.LinearLayout linearLayout) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.HONEYCOMB)) {
        linearLayout.setActivated(true);
    }else {
        linearLayout.setSelected(true);
    }
}