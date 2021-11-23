public static com.eclubprague.cardashboard.tablet.fragments.SimplePageFragment newInstance(java.util.List<com.eclubprague.cardashboard.core.modules.base.IModule> modules, int rowCount, int columnCount) {
    android.util.Log.d(com.eclubprague.cardashboard.tablet.fragments.SimplePageFragment.TAG, "recreating fragment: newInstance");
    com.eclubprague.cardashboard.tablet.fragments.SimplePageFragment fragment = new com.eclubprague.cardashboard.tablet.fragments.SimplePageFragment();
    fragment.setModules(modules);
    fragment.setRowCount(rowCount);
    fragment.setColumnCount(columnCount);
    return fragment;
}