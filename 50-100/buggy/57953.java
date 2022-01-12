public static void resetAll(android.content.SharedPreferences sp) {
    sp.edit().putBoolean(itcr.reciclemos.gameutilities.Progress.INFORMATION, false).apply();
    sp.edit().putBoolean(itcr.reciclemos.gameutilities.Progress.LAKE, false).apply();
    sp.edit().putBoolean(itcr.reciclemos.gameutilities.Progress.HOUSE, false).apply();
}