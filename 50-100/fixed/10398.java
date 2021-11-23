private void setupLogo() {
    android.app.Fragment fragmentLogo = fm.findFragmentById(R.id.fragmentContainer);
    if (fragmentLogo == null) {
        fragmentLogo = new testproject.halfmoonstudios.com.ponder.LogoFragment();
        fm.beginTransaction().add(R.id.fragmentContainer, fragmentLogo).commit();
        cd = new android.os.CountDownTimer(2000, 10000) {
            @java.lang.Override
            public void onTick(long millisUntilFinished) {
            }

            @java.lang.Override
            public void onFinish() {
                replaceMenuFragment();
                replaceOptionsFragment();
            }
        };
        cd.start();
    }
}