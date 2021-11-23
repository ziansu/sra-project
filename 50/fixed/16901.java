@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    InfoWindow earlyInfo = new InfoWindow("Early Space Travel");
    earlyInfo.setText(early.getInfo());
    earlyInfo.addImg(early);
}