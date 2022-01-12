@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((main) != null) {
        main.destroy();
    }
}