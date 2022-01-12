private void SetBgr(java.lang.String file) {
    sbi = null;
    try {
        sbi = new namori.love.code.SetBgrImg(file);
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
    sbi.setBounds(0, 0, Stat.FrameWidth, Stat.FrameHeight);
    lp.add(sbi, javax.swing.JLayeredPane.DEFAULT_LAYER);
    java.lang.System.out.println((("����̹��� ����: " + file) + (sbi.getWidth())));
}