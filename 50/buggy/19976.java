@org.testng.annotations.Test
public void testDataCreation() {
    org.testng.Assert.assertEquals(historyFacade.getHistoryById(hDTO.getID()), hDTO);
    org.testng.Assert.assertEquals(historyFacade.getHistoryById(hDTO2.getID()), hDTO2);
}