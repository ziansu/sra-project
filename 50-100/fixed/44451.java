@BeforeClass
public static void backupContactsTxt() {
    try {
        java.nio.file.Files.copy(java.nio.file.Paths.get("contacts.txt"), java.nio.file.Paths.get("contactsCOPY.txt"));
        java.nio.file.Files.delete(java.nio.file.Paths.get("contacts.txt"));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}