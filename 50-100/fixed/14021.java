public final void randomizeProperties() {
    name = com.hazelcast.simulator.tests.map.helpers.Employee.NAMES[com.hazelcast.simulator.tests.map.helpers.Employee.RANDOM.nextInt(com.hazelcast.simulator.tests.map.helpers.Employee.NAMES.length)];
    age = com.hazelcast.simulator.tests.map.helpers.Employee.RANDOM.nextInt(com.hazelcast.simulator.tests.map.helpers.Employee.MAX_AGE);
    salary = (com.hazelcast.simulator.tests.map.helpers.Employee.RANDOM.nextDouble()) * (com.hazelcast.simulator.tests.map.helpers.Employee.MAX_SALARY);
    active = com.hazelcast.simulator.tests.map.helpers.Employee.RANDOM.nextBoolean();
}