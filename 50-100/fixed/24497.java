@com.wordnik.swagger.annotations.ApiOperation(value = "根据ID获得一个分享作品（无需登录）", notes = "")
@org.springframework.web.bind.annotation.RequestMapping(value = "/getShareWorksById", method = { org.springframework.web.bind.annotation.RequestMethod.GET })
@org.springframework.web.bind.annotation.ResponseBody
public cn.edu.nju.software.controller.user.ResponseData<cn.edu.nju.software.controller.user.Works> getShareWorksById(@com.wordnik.swagger.annotations.ApiParam(value = "作品ID")
@org.springframework.web.bind.annotation.RequestParam(value = "id")
int id, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    cn.edu.nju.software.controller.user.ResponseData<cn.edu.nju.software.controller.user.Works> responseData = new cn.edu.nju.software.controller.user.ResponseData();
    cn.edu.nju.software.controller.user.Works works = worksService.getWorksById(id);
    if (works == null) {
        responseData.jsonFill(2, "作品不存在", null);
        return responseData;
    }
    responseData.jsonFill(1, null, works);
    return responseData;
}