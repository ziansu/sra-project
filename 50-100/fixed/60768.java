@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    java.lang.System.out.println("Oi");
    if ((ae.getActionCommand()) == "Turno") {
        clicado = null;
        cardgame.GameManager.getInstance().trocarTurno();
        turno = cardgame.GameManager.getInstance().getTurno();
        model.trocarTurno(turno);
        view.updateTurnText(turno);
        view.repaint();
    }
}