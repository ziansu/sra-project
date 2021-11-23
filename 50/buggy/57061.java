@com.softserve.fineui.AfterClass
public static void afterAll() {
    com.softserve.fineui.Utils.removeFolder(new java.io.File("temp"));
}