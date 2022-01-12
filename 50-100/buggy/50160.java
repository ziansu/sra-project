@org.junit.Test
public void testCheckCollectionFilesPost() {
    java.lang.System.out.println("testCheckCollectionFilesPost");
    org.restheart.handlers.RequestContext context = createContext("/db/fs.files", "POST");
    assertEquals(context.getType(), RequestContext.TYPE.FILES_BUCKET);
    assertEquals(context.getMethod(), RequestContext.METHOD.POST);
    assertEquals(false, org.restheart.handlers.injectors.CollectionPropsInjectorHandler.checkCollection(context));
}