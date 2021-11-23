@hu.oe.nik.automatedcar.bus.Test
public void isBusSingleton() {
    hu.oe.nik.automatedcar.bus.Bus first = hu.oe.nik.automatedcar.bus.Bus.getInstance();
    hu.oe.nik.automatedcar.bus.Bus second = hu.oe.nik.automatedcar.bus.Bus.getInstance();
    org.junit.Assert.assertEquals((first == second), true);
    first.setACCMainSwitchState(true);
    org.junit.Assert.assertEquals((first == second), true);
}