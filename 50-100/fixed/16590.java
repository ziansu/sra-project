public long getNumOfExceedLimitHits() {
    if (org.wilson.world.manager.ConfigManager.getInstance().isOpenShiftApp()) {
        java.lang.String result = this.run("oo-cgroup-read memory.failcnt");
        long num = java.lang.Long.parseLong(result.trim());
        return num;
    }else {
        return 0;
    }
}