@org.springframework.web.bind.annotation.RequestMapping(value = "/getMembers")
public edu.hawaii.its.holiday.controller.WsSubject[] getMembers(@org.springframework.web.bind.annotation.RequestParam
java.lang.String grouping, @org.springframework.web.bind.annotation.RequestParam
java.lang.String username) {
    edu.hawaii.its.holiday.controller.WsSubjectLookup wsSubjectLookup = new edu.hawaii.its.holiday.controller.WsSubjectLookup();
    wsSubjectLookup.setSubjectIdentifier(username);
    edu.hawaii.its.holiday.controller.WsGetMembersResults wsGetMembersResults = new edu.hawaii.its.holiday.controller.GcGetMembers().assignActAsSubject(wsSubjectLookup).addSubjectAttributeName("uid").addGroupName((grouping + ":basis+include")).assignIncludeSubjectDetail(true).execute();
    return wsGetMembersResults.getResults()[0].getWsSubjects();
}