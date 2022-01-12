@org.junit.Test
public void getBills1() throws java.lang.Exception {
    java.util.Date month = new java.text.SimpleDateFormat("dd.MM.yyyy").parse("01.04.2016");
    java.util.List<java.util.ArrayList<java.lang.String>> bills = exportService.getBills(month, MkdChs.CHS, CisDivision.LESK, "13", true);
    org.junit.Assert.assertTrue(((bills.size()) > 25000));
}