private void closePosition(trader.bot.domain.TPosition position) {
    this.connectionHandler.placeBuyOrder(position);
}