@java.lang.Override
public void run() {
    com.jadventure.runtime.Server.logger.debug(("Server thread started with name: " + (java.lang.Thread.currentThread().getName())));
    com.jadventure.runtime.ServiceLocator.provide(new com.jadventure.runtime.NetworkIOHandler(client));
    com.jadventure.game.menus.MainMenu menu = new com.jadventure.game.menus.MainMenu();
    menu.start();
}