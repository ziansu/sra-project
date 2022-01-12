private static int getAddedCount(java.util.List<android.support.v4.app.Fragment> fragments, int containerId) {
    int count = 0;
    android.support.v4.app.Fragment fragment;
    for (int i = 0, s = fragments.size(); i < s; i++) {
        fragment = fragments.get(i);
        if (((fragment != null) && (fragment.isAdded())) && ((fragment.getId()) == containerId)) {
            count++;
        }
    }
    return count;
}