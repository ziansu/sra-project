@java.lang.Override
public void setStrategy(cl.smartcities.isci.transportinspector.map.strategies.Strategy strategy) {
    if (strategy != null) {
        this.currentStrategy = strategy;
        this.currentStrategy.notifyContextCurrentStrategy();
    }
}