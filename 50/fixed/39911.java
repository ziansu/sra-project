public com.acenosekai.antplayer.fragments.BaseFragment getInitialFragment() {
    try {
        return initialFragmentClass.newInstance();
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
        e.printStackTrace();
    }
    return null;
}