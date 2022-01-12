@java.lang.Override
public void onGetUserNickname(java.util.Map<java.lang.String, java.lang.String> userMap) {
    for (java.util.Map<java.lang.String, java.lang.Object> member : userList) {
        java.lang.String memberId = ((java.lang.String) (member.get("UserId")));
        java.lang.String nickname = userMap.get(memberId);
        if (nickname != null) {
            member.put("Nickname", nickname);
            updateUser(memberId, true);
            break;
        }
    }
    if ((mProxy) != null)
        mProxy.onGetUserNickname(userMap);
    
}