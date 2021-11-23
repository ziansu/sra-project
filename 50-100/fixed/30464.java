@java.lang.Override
public void onGuidedActionClicked(android.support.v17.leanback.widget.GuidedAction action) {
    if ((getSelectedActionPosition()) <= (mServerArrayList.size())) {
        java.lang.String server = mServerArrayList.get(((getSelectedActionPosition()) - 1)).getName();
        org.amahi.anywhere.util.Preferences.setServertoPref(server, mContext, mSharedPref);
        startActivity(new android.content.Intent(mContext, org.amahi.anywhere.activity.NavigationActivity.class));
    }
}