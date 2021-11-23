@org.junit.Before
public void loadEnv() {
    env = reactor.Environment.initializeIfEmpty().assignErrorJournal();
}