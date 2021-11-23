@org.junit.Test
public void store_page_body_if_element_not_present() throws java.io.IOException {
    page.get().getElements("dfghfjhg");
    java.io.File file = new java.io.File("target/page-content-tester/not-found/pagecontenttester.fetcher.FetchedPageTest.store_page_body_if_element_not_present.html");
    java.lang.String pageBody = org.apache.commons.io.FileUtils.readFileToString(file);
    org.hamcrest.MatcherAssert.assertThat(pageBody, org.hamcrest.Matchers.containsString("GitHub"));
}