protected void onDestroy() {
    super.onDestroy();
    for (android.support.v4.app.Fragment f : fragments) {
        if (org.kei.android.phone.netcap.OutputFragment.class.isInstance(f))
            ((org.kei.android.phone.netcap.OutputFragment) (f)).delete();
        
    }
}