@org.springframework.web.bind.annotation.RequestMapping(value = "/findAll", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = { "application/json" })
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String findAll(javax.servlet.http.HttpServletRequest request) {
    ke.co.turbosoft.tt.entity.User sessionUser = ke.co.turbosoft.tt.web.SecurityHelper.getSessionUser(request);
    if (sessionUser == null) {
        return getJsonErrorMsg("User is not logged on");
    }
    ke.co.turbosoft.tt.vo.Result<java.util.List<ke.co.turbosoft.tt.entity.Company>> ar = companyService.findAll(sessionUser.getUsername());
    if (ar.isSuccess()) {
        return getJsonSuccessData(ar.getData());
    }else {
        return getJsonErrorMsg(ar.getMsg());
    }
}