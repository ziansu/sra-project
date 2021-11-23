public void setCurrentForm(final com.codename1.impl.android.Form f) {
    if ((getCurrentForm()) == null) {
        flushGraphics();
    }
    if (com.codename1.impl.android.InPlaceEditView.isKeyboardShowing()) {
        com.codename1.impl.android.AndroidImplementation.stopEditing(true);
    }
    super.setCurrentForm(f);
    if ((isNativeTitle()) && (!(f instanceof com.codename1.ui.Dialog))) {
        com.codename1.impl.android.AndroidImplementation.activity.runOnUiThread(new com.codename1.impl.android.AndroidImplementation.SetCurrentFormImpl(com.codename1.impl.android.AndroidImplementation.activity, f));
    }
}