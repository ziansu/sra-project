public void log(java.lang.String message) {
    final java.lang.String timestamp = net.bubbaland.trivia.client.TriviaGUI.TIMESTAMP_FORMAT.format(net.bubbaland.trivia.client.TriviaGUI.TIME.getTime());
    for (final net.bubbaland.trivia.client.TriviaFrame panel : this.windowList) {
        panel.log(((timestamp + " ") + message));
    }
    java.lang.System.out.println(((timestamp + " ") + message));
}