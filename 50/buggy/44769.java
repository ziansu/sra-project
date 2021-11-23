public static void initBackGroundMusic(int musicRaw) {
    try {
        com.android.sjsofteducationapp.utils.Sound.mService = new com.android.sjsofteducationapp.utils.MusicBackground(com.android.sjsofteducationapp.utils.Sound.mContext, musicRaw, true);
        com.android.sjsofteducationapp.utils.Sound.mService.execute("");
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}