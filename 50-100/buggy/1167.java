@tss2.wiki.control.RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
@tss2.wiki.control.ResponseBody
public tss2.wiki.control.CommonResult addEntry(javax.servlet.http.HttpServletRequest request, @tss2.wiki.control.RequestBody
java.util.Map map) {
    tss2.wiki.control.WikiSession session = sessionService.checkUser(request);
    if (!(session.isValid()))
        return new tss2.wiki.control.CommonResult(1, "Authentication Failed");
    
    tss2.wiki.control.WikiUser user = session.getUser();
    if ((user.getType()) < (WikiUser.USER_ADMIN))
        return new tss2.wiki.control.CommonResult(1, "Poor Privilege");
    
    return contentService.process(new tss2.wiki.vo.WikiEntryVO(session, map));
}