protected com.jayway.restassured.specification.RequestSpecification whenAuthenticated() {
    com.jayway.restassured.specification.RequestSpecification spec = com.jayway.restassured.RestAssured.given();
    if (!(isAnonymous)) {
        spec = spec.auth().preemptive().basic(username, password);
    }
    return spec.header("Content-Type", "application/json");
}