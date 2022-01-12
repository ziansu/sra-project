@java.lang.Override
public void wantAttend(zuul.commands.Command command, zuul.person.Student gamer) {
    if (!(command.hasSecondWord())) {
        java.lang.System.out.println(Game.res.getString("game.attend"));
    }else
        if (command.getSecondWord().equals("lab")) {
            this.attendLab(gamer);
            java.lang.System.out.println(this.getLongDescription());
        }
    
}