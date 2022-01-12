@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    melody.removeLastSound();
    melodyTF.setText(melody.toString());
    pentagram.repaint();
}