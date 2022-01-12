@com.wordnik.swagger.annotations.ApiOperation(value = "获取用户信息", notes = "获取用户信息")
@org.springframework.web.bind.annotation.RequestMapping(value = "/getUserBaseInfo", method = { org.springframework.web.bind.annotation.RequestMethod.GET })
@org.springframework.web.bind.annotation.ResponseBody
public cn.edu.nju.software.entity.ResponseData<cn.edu.nju.software.entity.User> getUserInfo(@com.wordnik.swagger.annotations.ApiParam(value = "用户ID")
@org.springframework.web.bind.annotation.RequestParam(value = "userId")
int userId, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    cn.edu.nju.software.entity.ResponseData responseData = new cn.edu.nju.software.entity.ResponseData();
    cn.edu.nju.software.entity.UserBase userBase = userService.getUserBaseById(userId);
    if (userBase == null) {
        responseData.jsonFill(2, "用户不存在。", null);
        return responseData;
    }
    responseData.jsonFill(1, null, userBase);
    return responseData;
}