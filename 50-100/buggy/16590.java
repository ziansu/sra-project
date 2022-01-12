public int getNumOfExceedLimitHits() {
    if (org.wilson.world.manager.ConfigManager.getInstance().isOpenShiftApp()) {
        java.lang.String result = this.run("oo-cgroup-read memory.failcnt");
        int num = java.lang.Integer.parseInt(result.trim());
        return num;
    }else {
        return 0;
    }
}