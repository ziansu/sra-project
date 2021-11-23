@org.junit.Test
public void setDefaultKeyMode_shouldSetKeyMode() {
    int[] modes = new int[]{ android.app.Activity.DEFAULT_KEYS_DISABLE , android.app.Activity.DEFAULT_KEYS_SHORTCUT , android.app.Activity.DEFAULT_KEYS_DIALER , android.app.Activity.DEFAULT_KEYS_SEARCH_LOCAL , android.app.Activity.DEFAULT_KEYS_SEARCH_GLOBAL };
    android.app.Activity activity = new android.app.Activity();
    org.robolectric.shadows.ShadowActivity shadow = org.robolectric.Shadows.shadowOf(activity);
    for (int mode : modes) {
        activity.setDefaultKeyMode(mode);
        org.assertj.core.api.Assertions.assertThat(shadow.getDefaultKeymode()).as("Unexpected key mode").isEqualTo(mode);
    }
}