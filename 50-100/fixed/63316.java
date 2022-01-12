@org.junit.Test
public void test_01_Calculate() {
    model.Tariff tariff = new model.Tariff(0);
    model.TariffRange r1 = new model.TariffRange(0, java.lang.Integer.MAX_VALUE, 2.5);
    tariff.addTariffRange(r1);
    double res = tariff.calculate(15);
    org.junit.Assert.assertEquals(37.5, res, 0);
}