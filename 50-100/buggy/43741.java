public void onClick(android.content.DialogInterface dialog, int id) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), wtfisandroid.drinkinggamescollection.MainMenu.class);
    if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.LOLLIPOP)) {
        android.app.ActivityOptions options = android.app.ActivityOptions.makeSceneTransitionAnimation(this);
        android.transition.Slide slide = new android.transition.Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);
        startActivity(intent, options.toBundle());
    }else
        startActivity(intent);
    
    finish();
}