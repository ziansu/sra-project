@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource().equals(button)) || (e.getSource().equals(field))) {
        hm.addScore(field.getText(), Game.getScore());
        setVisible(false);
        new End("Game Over");
    }
}