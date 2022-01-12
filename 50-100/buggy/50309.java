@org.junit.Test
public void testAlwaysTrue() {
    nl.tu.api.apiworkshopteam2.AbstractFactory circuitInstance = new nl.tu.api.apiworkshopteam2.ConcreteFactory();
    circuitInstance.initiliazeEmptyCircuit();
    circuitInstance.addInput("X1");
    circuitInstance.moveGate(1);
    circuitInstance.addGate("not");
    nl.tu.api.apiworkshopteam2.CircuitTarget cirTarg;
    cirTarg = circuitInstance.createCicruit();
    java.lang.System.out.print(cirTarg.evaluate());
    assertTrue(cirTarg.evaluate());
}