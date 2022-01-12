@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    try {
        if (context instanceof android.app.Activity)
            mCallback = ((be.pzbethanienhuis.kadans.settings.SettingsFragment.SettingsListListener) (context));
        else
            android.util.Log.e(be.pzbethanienhuis.kadans.settings.SettingsFragment.LOG_TAG, "onAttach, context != Activity");
        
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((context.toString()) + " must implement SettingsListListener"));
    }
}