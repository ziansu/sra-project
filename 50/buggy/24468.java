private void showGlobalToast(java.lang.String text) {
    if ((globalToast) != null) {
        globalToast.setText(text);
        globalToast.setDuration(Toast.LENGTH_LONG);
        globalToast.show();
    }
}