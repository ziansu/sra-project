public final void countdown() {
    if ((getCount()) > 1) {
        --(count);
    }else {
        for (gamelogic.LevelStrategy.StrategyObserver o : observers) {
            o.stop();
        }
    }
    for (gamelogic.LevelStrategy.StrategyObserver o : observers) {
        o.updateCount(getMessage());
    }
}