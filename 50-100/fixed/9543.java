@org.junit.Test
public void testValidateDelimitedPeriodShouldReturnFalseWhenStartEndDatePresent() {
    java.util.List<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.DelimitedPeriod> periods = new java.util.ArrayList<>();
    un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.DelimitedPeriod period = new un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.DelimitedPeriod();
    period.setStartDateTime(new un.unece.uncefact.data.standard.unqualifieddatatype._20.DateTimeType(null, new un.unece.uncefact.data.standard.unqualifieddatatype._20.DateTimeType.DateTimeString("ddfldf", "72829")));
    period.setEndDateTime(new un.unece.uncefact.data.standard.unqualifieddatatype._20.DateTimeType(null, new un.unece.uncefact.data.standard.unqualifieddatatype._20.DateTimeType.DateTimeString("ddfldf", "72829")));
    periods.add(period);
    assertFalse(fact.validateDelimitedPeriod(periods, true, true));
}