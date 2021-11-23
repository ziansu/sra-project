@org.testng.annotations.Test
public void testDataCreation() {
    org.testng.Assert.assertEquals(historyFacade.getHistoryById(hDTO.getId()), hDTO);
    org.testng.Assert.assertEquals(historyFacade.getHistoryById(hDTO2.getId()), hDTO2);
}