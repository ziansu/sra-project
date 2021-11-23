@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    InfoWindow earlyInfo = new InfoWindow(800, 600, "Early Space Travel");
    earlyInfo.setText(early.getInfo());
    earlyInfo.addImg(early);
}