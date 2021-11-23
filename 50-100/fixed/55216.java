@java.lang.Override
public void run() {
    for (int i = 0; i < (Statics.weeks.length); i++) {
        Statics.singleExecutor.runTask(loadWeekDataConnector.queue("readWeekData", ("" + (i + 1))));
        while (!(loadWeekDataConnector.isDone())) {
        } 
    }
    Statics.messenger.sendMessage("loaded all weekly data...");
}