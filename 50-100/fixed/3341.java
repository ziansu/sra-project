@java.lang.Override
public void notifyChannelMemberTypes(java.util.Map<java.lang.String, com.gotye.api.voichannel.MemberType> typeMap) {
    for (java.util.Map<java.lang.String, java.lang.Object> member : userList) {
        java.lang.String memberIdString = ((java.lang.String) (member.get("UserId")));
        if (typeMap.containsKey(memberIdString)) {
            member.put("MemberType", typeMap.get(memberIdString));
        }
        updateUser(memberIdString, true);
    }
    if ((mProxy) != null)
        mProxy.notifyChannelMemberTypes(typeMap);
    
}