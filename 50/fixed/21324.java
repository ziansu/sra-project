public void addIdleTime(int idleTimeIn) {
    java.lang.System.out.println(((timesPressed) + 1));
    avgIdleTime = (((avgIdleTime) * (timesPressed)) + idleTimeIn) / ((timesPressed) + 1);
    (timesPressed)++;
}