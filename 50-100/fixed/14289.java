@java.lang.Override
public void clicked(com.boxcubed.utils.MenuButton m) {
    if ((loadedInstance.player.connection) != null) {
        loadedInstance.player.connection.stop = true;
        try {
            loadedInstance.player.connection.join();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        loadedInstance.player.connection = null;
    }
    loadedInstance.player = new me.boxcubed.main.Sprites.Player(loadedInstance.getWorld(), 0);
    TopDown.instance.setScreen(loadedInstance);
}