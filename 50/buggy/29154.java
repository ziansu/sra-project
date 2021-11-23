public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        model.loadEvents();
    } catch (java.io.FileNotFoundException e1) {
        e1.printStackTrace();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}