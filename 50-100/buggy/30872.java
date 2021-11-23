@org.junit.Test
@pt.fccn.saw.selenium.Retry
public void suggestionsSiteTest() {
    java.lang.System.out.print("Running examples Test. \n");
    pt.fccn.sobre.arquivo.pages.IndexSobrePage index = null;
    try {
        index = new pt.fccn.sobre.arquivo.pages.IndexSobrePage(driver);
        pt.fccn.sobre.arquivo.pages.CollaboratePage collaborate = index.goToCollaboratePage();
        java.lang.System.out.println("Going to the Collborate Page");
        pt.fccn.sobre.arquivo.pages.SuggestionPage sug = collaborate.goToSuggestionSitePage();
        java.lang.System.out.println("Going to the Suggestion Site Page");
        org.junit.Assert.assertTrue("Failed The News Page Test in Portuguese", sug.sendSuggestion("PT"));
    } catch (java.io.IOException e) {
        org.junit.Assert.fail("IOException -> suggestionsSiteTest");
    }
}