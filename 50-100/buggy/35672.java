@org.geekhub.controllers.RequestMapping(value = "/course/comletetest/{testId}", method = RequestMethod.POST)
public java.lang.String completeTest(@org.geekhub.controllers.PathVariable(value = "testId")
int testId, @org.geekhub.controllers.RequestBody
java.lang.String jsonStr) {
    java.lang.System.out.println(jsonStr);
    com.google.gson.Gson gson = new com.google.gson.Gson();
    org.geekhub.hibernate.bean.TestInfo[] results = gson.fromJson(jsonStr, org.geekhub.hibernate.bean.TestInfo[].class);
    java.lang.System.out.println(results);
    testResultService.parseResult(results, testId);
    return "test-page/testPage";
}