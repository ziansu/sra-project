@org.junit.Test
public void testStore_File_To_Pithos() throws java.io.IOException {
    java.lang.System.out.println("---------------------------------------------------------------------");
    java.lang.System.out.println((((("STORE ACTUAL FILE: <" + (tests.TestPithosRestClient.LOCAL_SOURCE_FILE_TO_UPLOAD)) + "> TO PITHOS STORAGE SYSTEM AS OBJECT <") + (tests.TestPithosRestClient.PITHOS_OBJECT_NAME_TO_OUTPUTSTREAM)) + ">"));
    java.lang.System.out.println("---------------------------------------------------------------------");
    java.lang.String response = tests.TestPithosRestClient.hdconnector.uploadFileToPithos("", tests.TestPithosRestClient.LOCAL_SOURCE_FILE_TO_UPLOAD, false);
    java.lang.System.out.println(("RESPONSE FROM PITHOS: " + response));
    java.lang.System.out.println("---------------------------------------------------------------------\n");
}