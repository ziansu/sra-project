private void disableButtons() {
    btnBackward.setClickable(false);
    btnForward.setClickable(false);
    btnRight.setClickable(false);
    btnLeft.setClickable(false);
    btnReset.setClickable(false);
    btnBackward.setBackgroundResource(R.drawable.backward);
    btnForward.setBackgroundResource(R.drawable.forward);
    btnRight.setBackgroundResource(R.drawable.right);
    btnLeft.setBackgroundResource(R.drawable.left);
    prgrsbarLeft.setProgress(0);
    prgrsbarRight.setProgress(0);
    prgrsbarBackward.setProgress(0);
    prgrsbarForward.setProgress(0);
}