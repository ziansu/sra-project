@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConstructorBase1() {
    new tapaeconverter.aeconverter.TestConverterCore.ConcreteConverter(0);
}