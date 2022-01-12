@org.junit.Test
public void areEqualResultsEqual() {
    ru.unn.agile.LengthConvertor.Model.LengthConvertor z1 = new ru.unn.agile.LengthConvertor.Model.LengthConvertor();
    ru.unn.agile.LengthConvertor.Model.Length l1 = new ru.unn.agile.LengthConvertor.Model.Length(1, LengthUnit.Meter);
    ru.unn.agile.LengthConvertor.Model.Length res_z1 = z1.convert(l1, LengthUnit.Yard);
    ru.unn.agile.LengthConvertor.Model.LengthConvertor z2 = new ru.unn.agile.LengthConvertor.Model.LengthConvertor();
    ru.unn.agile.LengthConvertor.Model.Length l2 = new ru.unn.agile.LengthConvertor.Model.Length(1, LengthUnit.Meter);
    ru.unn.agile.LengthConvertor.Model.Length res_z2 = z2.convert(l2, LengthUnit.Yard);
    assertTrue(res_z1.equals(res_z2));
}