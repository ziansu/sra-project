@org.junit.Before
public void setUp() throws java.lang.Exception {
    azureStorageUtils = new org.talend.components.azurestorage.utils.AzureStorageUtils();
    folder = (getClass().getResource("/").getPath()) + (TEST_FOLDER_PUT);
}