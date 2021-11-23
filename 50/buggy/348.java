@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConstructorBase1() {
    tapaeconverter.aeconverter.ConverterCore p1 = new tapaeconverter.aeconverter.TestConverterCore.ConcreteConverter(0);
}