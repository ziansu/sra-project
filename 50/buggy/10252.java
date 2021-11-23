public void showFab() {
    if ((getFab().getVisibility()) == (android.view.View.GONE)) {
        getFab().show();
    }
    java.lang.System.out.println(getFab().getVisibility());
}