@org.springframework.web.bind.annotation.RequestMapping(value = "/getStatusOfRunningTest", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getStateOfRunningTest() {
    return com.practice.collection.controller.TestRunnerController.GSON.toJson(testRunnerService.getStateOfRunningTest());
}