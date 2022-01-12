@java.lang.Override
public void processInputMessage(java.lang.String text, spaceisnear.game.GameConsole console) {
    if (context.isLogined()) {
        if (context.isPlayable()) {
            if (text.startsWith("-")) {
                processControlSequence(text, console);
            }else {
                sendMessageFromPlayer(text);
            }
        }else {
            sendOOC(text);
        }
    }else {
        console.pushMessage(new spaceisnear.game.ChatString("You cannot write messages while not connected!", LogLevel.WARNING));
    }
}