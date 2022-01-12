@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if (((gm) instanceof networking.GameManagerNetwork) && (((networking.GameManagerNetwork) (gm)).isYourRound())) {
        java.lang.System.err.println("PUOI TIRARE IL DADO");
        int lancioCorrente = core.Dado.lanciaDadi();
        animazione(lancioCorrente);
    }else
        if ((gm) instanceof core.GameManager) {
            java.lang.System.err.println("ISTANZA DI GAME MANAGER NORMALE");
            int lancioCorrente = core.Dado.lanciaDadi();
            animazione(lancioCorrente);
        }
    
}