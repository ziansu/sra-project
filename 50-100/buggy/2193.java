private void setRound(android.view.View view) {
    if ((Build.VERSION.SDK_INT) >= 16) {
        android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
        gd.setColor(codepath.apps.demointroandroid.util.ScoreKeeperUtils.getBackgroundColor(view));
        gd.setCornerRadius(45);
        view.setBackground(gd);
    }
}