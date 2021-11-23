@org.junit.Test
public void test_02_Calculate() {
    model.Tariff tariff = new model.Tariff(0, 0);
    model.TariffRange r1 = new model.TariffRange(0, 150, 2.5);
    model.TariffRange r2 = new model.TariffRange(151, java.lang.Integer.MAX_VALUE, 3.5);
    tariff.addTariffRange(r1);
    tariff.addTariffRange(r2);
    double res = tariff.calculate(160);
    org.junit.Assert.assertEquals(410, res, 0);
}