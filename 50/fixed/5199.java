@cucumber.api.java.en.Then(value = "^response should be json in file \"(.*?)\"$")
public final void responseShouldBeJsonResponseBody(final java.lang.String contentFilePath) throws java.lang.Throwable {
    this.responseShouldBeJson(org.tomitribe.beryllium.Utility.fileContent(contentFilePath));
}