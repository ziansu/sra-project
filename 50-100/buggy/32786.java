@org.springframework.web.bind.annotation.RequestMapping(value = "/askResumeFlag")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Object askResumeFlag(@org.springframework.web.bind.annotation.RequestParam(value = "spaceUserID", required = false)
java.lang.Integer spaceUserID, @org.springframework.web.bind.annotation.RequestParam(value = "askUserID", required = false)
java.lang.Integer askUserID) throws java.io.UnsupportedEncodingException {
    if (askUserID == null) {
        return false;
    }
    java.util.List<com.wls.manage.entity.ResumeVisEntity> resumeVisEntities = resumeVisMapper.findvisibleridByOwnerId(spaceUserID);
    for (com.wls.manage.entity.ResumeVisEntity resumeVisEntity : resumeVisEntities) {
        if ((askUserID.intValue()) == (resumeVisEntity.getVisiblerid().intValue())) {
            return true;
        }
    }
    return false;
}