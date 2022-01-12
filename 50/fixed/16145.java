public boolean isAchieved() {
    return !(this.getProperty("achieved").equals("false"));
}