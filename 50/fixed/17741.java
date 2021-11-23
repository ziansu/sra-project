@org.junit.Test
public void testCycleStats() throws java.lang.Exception {
    assertEquals("index", cycleController.cycleStats(modelMap));
    org.mockito.Mockito.verify(modelMap).addAttribute(org.mockito.Matchers.eq("cycleDetails"), org.mockito.Matchers.eq("{\"checkpoints\":[{\"enlightenedScore\":100000,\"resistanceScore\":200000},{\"enlightenedScore\":140000,\"resistanceScore\":201000}]}"));
}