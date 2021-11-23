@java.lang.Override
public void showMaterial(java.lang.String tag) {
    android.util.Log.i(com.example.yurii.speakeasy.StartUpActivity.TAG, "showMaterial");
    prevWindowState = currentWindowState;
    currentWindowState = PAGE_TYPE.TAG;
    tagFragment = com.example.yurii.speakeasy.ContentFragment.newInstance(currentWindowState, 0, tag);
    getSupportFragmentManager().beginTransaction().replace(R.id.tag_frame_layout, tagFragment, com.example.yurii.speakeasy.StartUpActivity.TAG_FRAGMENT).commit();
    updateWindowState(false);
}