@org.junit.Test
public void logUsingRequestSpec() throws java.lang.Exception {
    given().log().everything().and().expect().body(equalTo("ERROR")).when().get("/409");
}