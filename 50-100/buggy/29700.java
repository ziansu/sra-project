@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    if (!(activity instanceof com.google.android.apps.muzei.settings.SettingsChooseSourceFragment.Callbacks)) {
        throw new java.lang.ClassCastException("Activity must implement fragment callbacks.");
    }
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "sources");
    com.google.firebase.analytics.FirebaseAnalytics.getInstance(getActivity()).logEvent(FirebaseAnalytics.Event.VIEW_ITEM_LIST, bundle);
}