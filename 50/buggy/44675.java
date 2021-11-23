@io.swagger.annotations.ApiOperation(value = "客户端-查询历史冠军走向")
@com.racing.controller.user.RequestMapping(value = "/history/champion", method = RequestMethod.GET)
public java.lang.Object historyChampion(@com.racing.controller.user.RequestParam(required = false, defaultValue = "10")
java.lang.Integer nper) {
    if (nper > 10) {
        nper = 10;
    }
    return recordResultService.historyChampion(nper);
}