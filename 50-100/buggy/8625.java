public static void changeCurrentPreference(int pref_index, int value) {
    if ((com.Veiled.Utils.PreferencesManipulation.userPrefs) == null) {
        com.Veiled.Utils.PreferencesManipulation.userPrefs = new int[]{ 1 , 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 };
    }
    com.Veiled.Utils.PreferencesManipulation.userPrefs[pref_index] = value;
}