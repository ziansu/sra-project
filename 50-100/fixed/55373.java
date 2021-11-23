@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteUserById/{id}", method = { org.springframework.web.bind.annotation.RequestMethod.DELETE })
@org.springframework.web.bind.annotation.ResponseBody
@com.wordnik.swagger.annotations.ApiOperation(value = "根据用户ID删除用户", notes = "")
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
public cn.edu.nju.software.entity.ResponseData<java.lang.Boolean> deleteUserById(@com.wordnik.swagger.annotations.ApiParam(value = "id")
@org.springframework.web.bind.annotation.PathVariable
int id, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    cn.edu.nju.software.entity.ResponseData<java.lang.Boolean> responseData = new cn.edu.nju.software.entity.ResponseData();
    boolean res = userMessageService.deleteUserById(id);
    responseData.jsonFill((res ? 1 : 2), null, res);
    if (!res) {
        throw new java.lang.RuntimeException("删除失败");
    }
    return responseData;
}