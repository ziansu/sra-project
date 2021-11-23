@org.springframework.web.bind.annotation.RequestMapping(value = "/cop/smt/mrm/detailMemoReprt.do")
@org.springframework.security.access.annotation.Secured(value = "ROLE_USER")
public java.lang.String detailMemoReprt(@org.springframework.web.bind.annotation.ModelAttribute
aramframework.com.cop.smt.mrm.domain.MemoReprtVO memoReprtVO, org.springframework.ui.ModelMap model) {
    memoReprtService.selectMemoReprt(memoReprtVO);
    aramframework.com.uat.uia.domain.LoginVO loginVO = ((aramframework.com.uat.uia.domain.LoginVO) (aramframework.com.cmm.userdetails.UserDetailsHelper.getAuthenticatedUser()));
    model.addAttribute("uniqId", loginVO.getUniqId());
    if (loginVO.getUniqId().equals(memoReprtVO.getReportrId())) {
        memoReprtService.readMemoReprt(memoReprtVO);
    }
    return aramframework.com.cmm.util.WebUtil.adjustViewName("/cop/smt/mrm/MemoReprtDetail");
}