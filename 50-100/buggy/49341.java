public static void applyAudiowide(android.support.v7.app.AppCompatActivity activity, java.lang.Integer... views) {
    android.graphics.Typeface custom_font = android.graphics.Typeface.createFromAsset(activity.getAssets(), "fonts/Audiowide-Regular.ttf");
    for (java.lang.Integer viewId : views) {
        android.widget.TextView textView = ((android.widget.TextView) (activity.findViewById(viewId)));
        textView.setTypeface(custom_font);
    }
}