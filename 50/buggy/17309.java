@org.junit.Before
public void setup() throws java.io.IOException {
    hazelcastFactory.newHazelcastInstance();
    hazelcastFactory.newHazelcastInstance();
    hazelcastFactory.newHazelcastInstance();
    client = hazelcastFactory.newHazelcastClient();
}