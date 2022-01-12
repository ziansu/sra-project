@org.junit.Test
public void testNavigateToIndirectSubfolder() throws de.qabel.qabelbox.exceptions.QblStorageException {
    de.qabel.qabelbox.storage.BoxNavigation nav = volume.navigate();
    de.qabel.qabelbox.storage.BoxFolder boxFolder = nav.createFolder("foobdir");
    nav.commit();
    nav.navigate(boxFolder);
    de.qabel.qabelbox.storage.BoxFolder subfolder = nav.createFolder("subfolder");
    nav.commit();
    nav = volume.navigate();
    try {
        nav.navigate(subfolder);
    } catch (de.qabel.qabelbox.exceptions.QblStorageNotFound e) {
        return ;
    }
    fail("Expected QblStorageNotFound");
}