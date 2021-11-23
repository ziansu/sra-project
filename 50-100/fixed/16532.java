public java.lang.String getControllerProfileDefault(int player) {
    switch (player) {
        case 2 :
            return getString(GamePrefs.CONTROLLER_PROFILE2, "");
        case 3 :
            return getString(GamePrefs.CONTROLLER_PROFILE3, "");
        case 4 :
            return getString(GamePrefs.CONTROLLER_PROFILE4, "");
        default :
            break;
    }
    return getString(GamePrefs.CONTROLLER_PROFILE1, paulscode.android.mupen64plusae.persistent.GlobalPrefs.DEFAULT_CONTROLLER_PROFILE_DEFAULT);
}