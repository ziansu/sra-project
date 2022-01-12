private void findOneHourTimerDelay(java.lang.String[] timeParts) {
    int secNum = java.lang.Integer.parseInt(timeParts[2]);
    int minNum = java.lang.Integer.parseInt(timeParts[1]);
    int hourNum = java.lang.Integer.parseInt(timeParts[0]);
    oneHourTimerDelay = (((60 - secNum) + (60 * (10 - minNum))) + ((24 - hourNum) * 3600)) * 1000;
}