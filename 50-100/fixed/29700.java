@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if (!(context instanceof com.google.android.apps.muzei.settings.SettingsChooseSourceFragment.Callbacks)) {
        throw new java.lang.ClassCastException("Activity must implement fragment callbacks.");
    }
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "sources");
    com.google.firebase.analytics.FirebaseAnalytics.getInstance(getContext()).logEvent(FirebaseAnalytics.Event.VIEW_ITEM_LIST, bundle);
}