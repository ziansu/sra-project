private void findOneHourTimerDelay(java.lang.String[] timeParts) {
    int secNum = java.lang.Integer.parseInt(timeParts[2]);
    int minNum = (java.lang.Integer.parseInt(timeParts[1])) % 10;
    oneHourTimerDelay = ((60 - secNum) + (60 * (60 - minNum))) * 1000;
}