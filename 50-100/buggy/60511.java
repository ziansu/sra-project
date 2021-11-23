public void actionPerformed(java.awt.event.ActionEvent arg0) {
    filterArray();
    try {
        randomThreadCall();
        displayRandom();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    displayRandom();
    displayRandomText();
}