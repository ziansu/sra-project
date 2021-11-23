@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((cooldownCount) < (maxedOut)) {
        (cooldownCount)++;
    }else {
        canAttack = true;
        attackAction();
        attackSend.stop();
    }
}