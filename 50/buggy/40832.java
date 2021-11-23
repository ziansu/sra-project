@org.junit.Test
public void testKiloIsAThousand() {
    javax.measure.Quantity<javax.measure.quantity.Power> w2000 = tec.uom.se.quantity.Quantities.getQuantity(2000, tec.uom.se.unit.Units.WATT);
    javax.measure.Quantity<javax.measure.quantity.Power> kW2 = tec.uom.se.quantity.Quantities.getQuantity(2, tec.uom.se.unit.MetricPrefix.KILO(tec.uom.se.unit.Units.WATT));
}