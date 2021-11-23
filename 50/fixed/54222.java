@org.junit.Test
public void logUsingResponseSpec() throws java.lang.Exception {
    expect().log().everything().body(equalTo("ERROR")).when().get("/409");
}