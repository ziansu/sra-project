protected static boolean triggerOnBackPressed(java.util.List<com.floern.android.app.Fragment> fragments) {
    if (fragments == null) {
        return false;
    }
    for (com.floern.android.app.Fragment fragment : fragments) {
        if ((fragment instanceof com.floern.android.app.Fragment) && (fragment.isVisible())) {
            boolean consumed = ((com.floern.android.app.Fragment) (fragment)).onBackPressed();
            if (consumed)
                return true;
            
        }
    }
    return false;
}