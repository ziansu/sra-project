public void completeRefresh() {
    if ((refreshItem.getActionView()) != null) {
        refreshItem.getActionView().clearAnimation();
        refreshItem.setActionView(null);
    }
}