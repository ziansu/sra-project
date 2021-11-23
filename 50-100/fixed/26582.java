@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String ac = e.getActionCommand();
    com.jensen.yatzy.model.Dice[] dices = game.getDices();
    java.lang.String value = ac.substring(((ac.length()) - 1));
    java.lang.Integer index = java.lang.Integer.parseInt(value);
    dices[index].toggleLock();
    com.jensen.yatzy.view.DiceButton button = ((com.jensen.yatzy.view.DiceButton) (e.getSource()));
    button.DiceToggleLock();
}