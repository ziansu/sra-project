private static java.lang.String intArrayToStringMask() {
    java.lang.String mask = "";
    if ((com.Veiled.Utils.PreferencesManipulation.userPrefs) == null) {
        com.Veiled.Utils.PreferencesManipulation.userPrefs = new int[]{ 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 };
        com.Veiled.Utils.PreferencesManipulation.enrolled_user.setPreferences(com.Veiled.Utils.PreferencesManipulation.userPrefs);
    }
    for (int i = 0; i < (com.Veiled.Utils.PreferencesManipulation.userPrefs.length); i++)
        mask += (com.Veiled.Utils.PreferencesManipulation.userPrefs[i]) + "";
    
    return mask;
}