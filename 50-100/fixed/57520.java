public void resetAll() {
    filename1.clear();
    filename2.clear();
    modifications.get(0).clear();
    modifications.get(1).clear();
    resetBrightnesses();
    images[0] = null;
    images[1] = null;
    darknessWins.setSelected(false);
    style1.reset();
    style2.reset();
    resizeAction1 = null;
    resizeAction2 = null;
}