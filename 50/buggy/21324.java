public void addIdleTime(int idleTimeIn) {
    avgIdleTime = ((((avgIdleTime) * (timesPressed)) + idleTimeIn) / (timesPressed)) + 1;
    (timesPressed)++;
}