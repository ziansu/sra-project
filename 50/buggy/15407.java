private android.support.v7.widget.PopupMenu createPopupMenu(android.view.View view) {
    android.support.v7.widget.PopupMenu popup = new android.support.v7.widget.PopupMenu(getContext(), view);
    popup.getMenuInflater().inflate(R.menu.popup, popup.getMenu());
    return popup;
}