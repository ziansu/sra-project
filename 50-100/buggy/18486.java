@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getDialog()) != null) {
        getDialog().getWindow().getAttributes().windowAnimations = R.style.dialog_animation_fade;
        setStyle(DialogFragment.STYLE_NO_TITLE, org.tvheadend.tvhclient.Utils.getThemeId(activity));
    }
}