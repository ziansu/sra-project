@org.springframework.web.bind.annotation.RequestMapping(value = "/cop/smt/djm/editDeptJobBx.do")
@org.springframework.security.access.annotation.Secured(value = "ROLE_ADMIN")
public java.lang.String editDeptJobBx(aramframework.com.cop.smt.djm.domain.DeptJobBxVO deptJobBxVO, org.springframework.ui.ModelMap model) {
    model.addAttribute(deptJobService.selectDeptJobBx(deptJobBxVO));
    model.addAttribute("indictOrdrValue", deptJobBxVO.getIndictOrdr());
    return aramframework.com.cmm.util.WebUtil.adjustViewName("/cop/smt/djm/DeptJobBxEdit");
}