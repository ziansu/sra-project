public com.pajato.android.gamechat.account.Account getGroupMember(@android.support.annotation.NonNull
final java.lang.String groupKey, @android.support.annotation.NonNull
final java.lang.String memberKey) {
    java.util.Map<java.lang.String, com.pajato.android.gamechat.account.Account> memberMap = groupMemberMap.get(groupKey);
    return memberMap.get(memberKey);
}