@java.lang.Override
public void buttonPressed(java.lang.String buttonName, double result) {
    java.lang.System.out.println(("qst 2 fini, name = " + buttonName));
    if (buttonName.equals("continue")) {
        game.setScreen(new com.odysseedesmaths.dialogs.SimpleDialog(game, com.odysseedesmaths.Assets.DLG_ARRIVEE_2b, new com.odysseedesmaths.dialogs.EndButtonsListener() {
            @java.lang.Override
            public void buttonPressed(java.lang.String buttonName) {
                game.setScreen(new com.odysseedesmaths.minigames.accrobranche.Accrobranche(game));
            }
        }));
    }else
        if (buttonName.equals("restart")) {
            game.setScreen(game.getModeScene());
        }
    
}