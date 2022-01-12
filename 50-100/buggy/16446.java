public void startAll() throws java.lang.InterruptedException {
    for (zlc.season.rxdownload2.entity.DownloadMission each : missionMap.values()) {
        if (each.isCompleted()) {
            continue;
        }
        if (each instanceof zlc.season.rxdownload2.entity.SingleMission) {
            addDownloadMission(new zlc.season.rxdownload2.entity.SingleMission(((zlc.season.rxdownload2.entity.SingleMission) (each))));
        }
    }
}