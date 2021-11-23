@java.lang.Override
public void pauseGame() {
    mIsPaused = true;
    com.shakeup.setofthree.practicegame.DialogFragment pauseFragment = new com.shakeup.setofthree.pausemenu.PauseFragment();
    pauseFragment.setCancelable(false);
    pauseFragment.setTargetFragment(this, 1);
    pauseFragment.setStyle(com.shakeup.setofthree.practicegame.STYLE_NORMAL, R.style.PauseDialogStyle);
    pauseFragment.show(getFragmentManager(), "dialog");
}