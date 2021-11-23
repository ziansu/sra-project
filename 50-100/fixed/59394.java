public void run() {
    try {
        de.anghenfil.maingame.MainGame.user = de.anghenfil.maingame.UserManager.loadUser();
        de.anghenfil.maingame.MainGame.window = new de.anghenfil.gui.Window();
        de.anghenfil.maingame.MainGame.window.initialize();
        de.anghenfil.maingame.MainGame.room = new de.anghenfil.room.Room();
        de.anghenfil.maingame.MainGame.room = de.anghenfil.maingame.MainGame.room.loadRoom(de.anghenfil.maingame.MainGame.user.getAct_room());
        de.anghenfil.textdesign.TD.headline(de.anghenfil.maingame.MainGame.room.getRoomName());
        de.anghenfil.room.RoomScripts.customCode(de.anghenfil.maingame.MainGame.room.getRoomID());
        de.anghenfil.textdesign.TD.description(de.anghenfil.maingame.MainGame.room.getRoomDescription());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}