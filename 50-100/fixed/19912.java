public void closeAllChatWindows() {
    for (com.example.project.ChatWindow.ChatWindowController chatWindowController : chatWindowControllers.values()) {
        chatWindowController.shutdown();
    }
    if ((com.example.project.SessionManager.SessionManager.getInstance().getChatroomWelcomeScreenController()) != null) {
        com.example.project.SessionManager.SessionManager.getInstance().getChatroomWelcomeScreenController().shutdown();
    }
}