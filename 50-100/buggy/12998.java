@org.junit.Test
public void happyPath() {
    java.lang.String json = com.jayway.restassured.RestAssured.given().auth().basic(ServerConfig.USERNAME, ServerConfig.PASSWORD).body(questions.PostQuestionTest.questionOne).when().post(questions.PostQuestionTest.postUrl).then().statusCode(200).contentType(ContentType.JSON).extract().response().asString();
    java.lang.Long questionId = com.jayway.restassured.path.json.JsonPath.from(json).getLong("questionId");
    org.junit.Assert.assertNotNull(questionId);
    helpers.QuestionHelper.assertQuestionInSurvey(questions.PostQuestionTest.surveyId, questionId);
}