static java.util.List<com.hawhamburg.sg.data.AbstractValue> getDistanceData() {
    java.util.Random rng = new java.util.Random();
    java.util.List<com.hawhamburg.sg.data.AbstractValue> values = new java.util.LinkedList<>();
    for (int i = 0; i < ((rng.nextInt(((com.hawhamburg.sg.debug.RandomDataGenerator.MAXVALUESPERDATA) - 1))) + 1); i++) {
        com.hawhamburg.sg.data.AbstractValue value = new com.hawhamburg.sg.data.SensorValue(((com.hawhamburg.sg.debug.RandomDataGenerator.valueId)++), rng.nextInt(1024));
        values.add(value);
    }
    return values;
}