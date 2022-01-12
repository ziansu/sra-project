private void showThread(int p_col, int p_row) {
    if (p_row != (-1)) {
        java.lang.Thread x_thread = gui.LookupHelper.getAllActiveThreads(o_thread).get(p_row);
        gui.WindowManager.getInstance().openComponent(x_thread);
        gui.ThreadPanel.setTabIndex((p_col > 2 ? p_col - 2 : -1));
    }
}