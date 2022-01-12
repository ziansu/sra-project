public void printDebugInfo() {
    android.util.Log.d("JC", ("Current max streak: " + (com.spoiledmilk.ibikecph.IbikeApplication.getSettings().getMaxStreakLength())));
    android.util.Log.d("JC", ("Current max length ordinal: " + (com.spoiledmilk.ibikecph.IbikeApplication.getSettings().getLengthNotificationOrdinal())));
}