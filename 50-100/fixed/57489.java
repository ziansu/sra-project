@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    android.support.v4.view.ViewPager pager = ((android.support.v4.view.ViewPager) (findViewById(R.id.view_pager)));
    if (pager != null) {
        savedInstanceState.putParcelable(((java.lang.Integer) (R.id.view_pager)).toString(), pager.onSaveInstanceState());
    }
}