public void onFinish() {
    if ((this) != null) {
        nextCard.setOnClickYes(this);
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(nextCard, null);
        ft.commitAllowingStateLoss();
    }
}