private void enableDemoTabs() {
    for (int i = (jTabbedPane1.getTabCount()) - 1; i >= 0; i--) {
        if (!(jTabbedPane1.getTitleAt(i).equals("Activity"))) {
            jTabbedPane1.remove(i);
        }
    }
}