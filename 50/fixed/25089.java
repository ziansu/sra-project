public static void main(java.lang.String[] args) {
    adventure.Game.game = new adventure.Game();
    adventure.Item.initializeItems();
    adventure.Recipe.createRecipes();
    adventure.Interaction.createInteractions();
    adventure.Game.game.start();
}