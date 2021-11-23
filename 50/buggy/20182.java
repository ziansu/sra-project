@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent windowEvent) {
    data.writeToFile();
}