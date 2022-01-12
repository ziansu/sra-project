@org.testng.annotations.Test
public void updateTest() {
    hDTO.setInfo("hu hu");
    historyFacade.updateHistory(hDTO);
    java.sql.Date d2 = getDate(2015, 10, 13);
    hDTO2.setHistoryDate(d2);
    historyFacade.updateHistory(hDTO2);
    org.testng.Assert.assertEquals(historyFacade.getHistoryById(hDTO.getID()).getInfo(), "hu hu");
    org.testng.Assert.assertEquals(((java.sql.Date) (historyFacade.getHistoryById(hDTO2.getID()).getHistoryDate())), d2);
}