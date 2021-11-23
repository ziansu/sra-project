@org.junit.Test
public void testGetHandler() {
    restrSaveCmd.injected_Handler(null);
    assertNotNull(restrSaveCmd.getHandler(context));
    assertEquals("Expecting RestructureSaveHandler handler.", com.celements.navigation.cmd.ReorderSaveHandler.class, restrSaveCmd.getHandler(context).getClass());
}