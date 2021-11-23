private void disableButtons() {
    btnBackward.setEnabled(false);
    btnForward.setEnabled(false);
    btnRight.setEnabled(false);
    btnLeft.setEnabled(false);
    btnReset.setEnabled(false);
    btnBackward.setBackgroundResource(R.drawable.backward);
    btnForward.setBackgroundResource(R.drawable.forward);
    btnRight.setBackgroundResource(R.drawable.right);
    btnLeft.setBackgroundResource(R.drawable.left);
    prgrsbarLeft.setProgress(0);
    prgrsbarRight.setProgress(0);
    prgrsbarBackward.setProgress(0);
    prgrsbarForward.setProgress(0);
}