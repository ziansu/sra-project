@org.springframework.web.bind.annotation.RequestMapping(value = "/find", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = { "application/json" })
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String find(@org.springframework.web.bind.annotation.RequestParam(value = "idCompany", required = true)
java.lang.Integer idCompany, javax.servlet.http.HttpServletRequest request) {
    ke.co.turbosoft.tt.entity.User sessionUser = ke.co.turbosoft.tt.web.SecurityHelper.getSessionUser(request);
    ke.co.turbosoft.tt.vo.Result<ke.co.turbosoft.tt.entity.Company> ar = companyService.find(idCompany, sessionUser.getUsername());
    if (ar.isSuccess()) {
        return getJsonSuccessData(ar.getData());
    }else {
        return getJsonErrorMsg(ar.getMsg());
    }
}