@org.junit.Test
public void test() {
    play.api.mvc.Request<play.mvc.Http.RequestBody> request = fakeRequest.getWrappedRequest();
    java.util.Collection<play.api.http.MediaRange> acceptedTypes = scala.collection.JavaConversions.asJavaCollection(request.acceptedTypes());
    java.lang.String description = java.lang.String.format("resulting format for passedFormat=%s, acceptedTypes=%s", passedFormat, acceptedTypes);
    java.lang.String result = controllers.resources.Accept.formatFor(passedFormat, acceptedTypes);
    org.fest.assertions.Assertions.assertThat(result).as(description).startsWith(expectedFormat);
}