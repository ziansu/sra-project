public double calculateAverageAge() {
    double averageAge = 0;
    for (int age : ages) {
        averageAge += age;
    }
    if (ages.isEmpty()) {
        averageAge = averageAge / (ages.size());
        return averageAge;
    }else {
        return sapaca.Statistics.IS_ZERO;
    }
}