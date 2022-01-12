@java.lang.Override
public java.lang.Iterable<widgets.Point> getPoints() {
    java.lang.Iterable<stores.HappinessStore.HistoryEntry> source = stores.HappinessStore.getInstance().getLogs();
    java.lang.Iterable<java.lang.Float> values = util.ListTools.map(new util.ListTools.Fun1<stores.HappinessStore.HistoryEntry, java.lang.Float>() {
        @java.lang.Override
        public java.lang.Float call(stores.HappinessStore.HistoryEntry val) {
            return val.getHappiness();
        }
    }, source);
    float max = util.ListTools.max(values);
    float min = util.ListTools.min(values);
    return null;
}