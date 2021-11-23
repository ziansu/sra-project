@org.junit.Test
public void test_03_Calculate() {
    model.Tariff tariff = new model.Tariff(0, 0);
    model.TariffRange r1 = new model.TariffRange(0, 150, 2.5);
    tariff.addTariffRange(r1);
    double res = tariff.calculate(0);
    org.junit.Assert.assertEquals(0, res, 0);
}