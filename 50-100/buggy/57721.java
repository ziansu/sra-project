@java.lang.Override
public void handle(javafx.event.ActionEvent t) {
    if (!(Grepolis.GrepolisBot.startedBot)) {
        Grepolis.GrepolisBot.botIsRunning = true;
        Grepolis.util.MyLogger.log("Bot enabled");
        new java.lang.Thread(new Grepolis.GrepolisBot.Startup()).start();
        new java.lang.Thread(new Grepolis.GrepolisBot.TitleUpdater()).start();
        Grepolis.GrepolisBot.startBot.setText("Pause bot");
        Grepolis.GrepolisBot.startedBot = true;
    }else {
        Grepolis.GrepolisBot.pauseBot();
    }
}