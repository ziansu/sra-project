private void showUI(boolean show) {
    if (show) {
        add(panel);
    }else {
        java.lang.System.out.println("removing panel");
        remove(panel);
    }
}