public static void main(java.lang.String[] args) throws exceptions.GameFailureException {
    game.TradingManager tradingManager = new game.TradingManager(game.TestImplementation.INITIAL_CAPITAL);
    tradingstrategy.BaseTradingStrategy strategy = new trading.TradingStrategy(tradingManager);
    dataobjects.GameData data = game.GameDataResolver.getInstance().getGameData();
    game.Game game = new game.Game(strategy, data);
    dataobjects.GameOutput output = game.getResult();
    java.lang.System.out.println(("Final funds: �" + (output.getTotalFunds())));
}