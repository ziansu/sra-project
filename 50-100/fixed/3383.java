@org.springframework.web.bind.annotation.RequestMapping(value = "updateProgramme")
public java.lang.String updateProgramme(@org.springframework.web.bind.annotation.RequestParam
java.lang.String programmeId, @org.springframework.web.bind.annotation.RequestParam
java.lang.String content) {
    com.tuqi.domain.model.ProgrammeDO programmeDO = new com.tuqi.domain.model.ProgrammeDO();
    if (org.apache.commons.lang3.StringUtils.isNotBlank(programmeId)) {
        programmeDO = programmeManager.selectByPrimaryKey(java.lang.Long.valueOf(programmeId));
    }
    if ((null != programmeDO) && (org.apache.commons.lang3.StringUtils.isNotBlank(content))) {
        programmeDO.setContent(content);
    }
    programmeManager.updateByPrimaryKeySelective(programmeDO);
    return "/showProgrammeList";
}