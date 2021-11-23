public boolean checkSpike() {
    double averageCurrent = 0;
    double current = robotPDP.getCurrent(0);
    if ((count) > 100) {
        averageCurrent = (averageCurrent + current) / 2;
        count += 1;
    }else {
        double difference = current - averageCurrent;
    }
}