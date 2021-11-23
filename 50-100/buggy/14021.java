public void randomizeProperties() {
    name = com.hazelcast.simulator.tests.map.helpers.Employee.NAMES[com.hazelcast.simulator.tests.map.helpers.Employee.RANDOM.nextInt(com.hazelcast.simulator.tests.map.helpers.Employee.NAMES.length)];
    age = com.hazelcast.simulator.tests.map.helpers.Employee.RANDOM.nextInt(com.hazelcast.simulator.tests.map.helpers.Employee.MAX_AGE);
    active = com.hazelcast.simulator.tests.map.helpers.Employee.RANDOM.nextBoolean();
    salary = (com.hazelcast.simulator.tests.map.helpers.Employee.RANDOM.nextDouble()) * (com.hazelcast.simulator.tests.map.helpers.Employee.MAX_SALARY);
}