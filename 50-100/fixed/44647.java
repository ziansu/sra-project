@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource().equals(button)) || (e.getSource().equals(field))) {
        hm.addScore(field.getText(), Game.getScore());
        new End("Game Over");
        setVisible(false);
    }
}