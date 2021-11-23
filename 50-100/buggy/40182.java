public void saveToCache(org.bukkit.GameMode currentGM, main.java.com.djrapitops.plan.data.UserData data) {
    java.util.HashMap<org.bukkit.GameMode, java.lang.Long> times = data.getGmTimes();
    handler.getActivityHandler().saveToCache(data);
    long lastSwap = data.getLastGmSwapTime();
    long playtime = data.getPlayTime();
    data.setGMTime(currentGM, ((times.get(currentGM)) + (playtime - lastSwap)));
    data.setLastGmSwapTime(playtime);
}