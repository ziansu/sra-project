@org.junit.Test(expected = joptsimple.OptionException.class)
public void testEmpty() {
    testRead(null, org.zavodnikov.cli.JOptSimple.cli("-r"));
}