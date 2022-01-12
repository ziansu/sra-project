private int startBackGroundDU() {
    int result = 0;
    it.grid.storm.info.SpaceInfoManager.getInstance().foundSAtoAnalyze();
    result = it.grid.storm.info.SpaceInfoManager.getInstance().bDUTasks.howManyTask();
    it.grid.storm.info.SpaceInfoManager.log.debug("Tasks: {}", result);
    if (result > 0) {
        it.grid.storm.info.SpaceInfoManager.getInstance().submitTasks(it.grid.storm.info.SpaceInfoManager.getInstance().bDUTasks);
    }
    return result;
}