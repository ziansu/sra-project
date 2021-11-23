@java.lang.Override
protected void onDialogCreated(android.app.Dialog dialog) {
    super.onDialogCreated(dialog);
    dialog.create();
    android.widget.CheckBox view = ((android.widget.CheckBox) (dialog.findViewById(R.id.lockscreen_remote_input)));
    view.setChecked((!(mAllowRemoteInput)));
    view.setOnCheckedChangeListener(mListener);
    android.view.View panel = dialog.findViewById(com.android.internal.R.id.customPanel);
    panel.setVisibility(com.android.settings.notification.NotificationLockscreenPreference.checkboxVisibilityForSelectedIndex(mInitialIndex, mShowRemoteInput));
    mListener.setView(panel);
}