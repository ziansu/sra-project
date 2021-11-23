@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
    mooncakemonster.orbitalcalendar.ImportExternal.ImportFacebookLogin fragment = new mooncakemonster.orbitalcalendar.ImportExternal.ImportFacebookLogin();
    fragment.show(fragmentManager, "facebook_login_fragment");
}