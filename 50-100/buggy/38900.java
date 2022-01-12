@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    if ((currentIndex) == (infoBank.length)) {
        currentIndex = 0;
        dvdInfo.setText(infoBank[currentIndex].toString());
    }else {
        updateDVD();
        dvdInfo.setText(infoBank[currentIndex].toString());
    }
}