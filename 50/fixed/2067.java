@org.junit.Test
public void test() {
    java.lang.System.out.println("test:");
    com.design.state.GumballMachine m = new com.design.state.GumballMachine(0);
    m.insertQuarter();
    m.ejectQuarter();
    m.turnCrank();
}