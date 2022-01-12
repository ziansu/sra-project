@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String cmd = e.getActionCommand();
    if (cmd.equals("Plant")) {
        isClicked = cisc275.game.view.SplashScreen.click.plant1;
        cisc275.game.view.SplashScreen.crabby = false;
    }else
        if (cmd.equals("Garbage Collector")) {
            isClicked = cisc275.game.view.SplashScreen.click.gC1;
            cisc275.game.view.SplashScreen.crabby = false;
            getGCButton().setBorderPainted(true);
            getPButton().setBorderPainted(false);
        }
    
}