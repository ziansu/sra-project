protected void initializeSMAR() {
    if (de.dhbw.smar.helpers.LoginHelper.getInstance().isLoggedIn()) {
        setContentView(R.layout.activity_main);
        if (firstInitialize) {
            firstInitialize = false;
            new de.dhbw.smar.svg.SVGDownload(this).checkSVGRepository();
        }
    }else {
        android.content.Intent startNewActivityOpen = new android.content.Intent(this, de.dhbw.smar.LoginActivity.class);
        startActivityForResult(startNewActivityOpen, ActivityCodeHelper.ACTIVITY_LOGIN_REQUEST);
    }
}