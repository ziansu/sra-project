public void createNewTutorial(org.bukkit.entity.Player player, java.lang.String tutorialName) {
    this.name = tutorialName;
    this.factory = new io.snw.tutorial.ConversationFactory(plugin).withModality(true).withFirstPrompt(new io.snw.tutorial.CreateTutorial.Welcome()).withEscapeSequence("/quit").withTimeout(10).thatExcludesNonPlayersWithMessage("You must be in game!");
    factory.buildConversation(player).begin();
}