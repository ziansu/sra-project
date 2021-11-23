public void seekUpdation() {
    if ((mp) != null) {
        seekBar.setProgress(mp.getCurrentPosition());
        seekHandler.postDelayed(run, 10);
    }
}