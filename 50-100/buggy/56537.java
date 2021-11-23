private void setCenterBtnFeedback(android.content.SharedPreferences sp, android.content.Context context, java.lang.String key) {
    java.lang.String pref = sp.getString(key, context.getString(R.string.vibrate_only));
    if (pref.equals(context.getString(R.string.vibrate_only)))
        centerBtnFeedback = watch.stopwatch.MainActivity.CenterBtnFeedback.VIBRATE;
    else
        if (pref.equals(context.getString(R.string.sound_only)))
            centerBtnFeedback = watch.stopwatch.MainActivity.CenterBtnFeedback.SOUND;
        else
            if (pref.equals(context.getString(R.string.soundAndVibrate)))
                centerBtnFeedback = watch.stopwatch.MainActivity.CenterBtnFeedback.BOTH;
            else
                centerBtnFeedback = watch.stopwatch.MainActivity.CenterBtnFeedback.NONE;
            
        
    
}