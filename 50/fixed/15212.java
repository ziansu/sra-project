public static java.util.List<com.appdhack.sup.dto.SlackUser> getUserList() {
    return new java.util.ArrayList(com.appdhack.sup.slack.SlackUtil.userIdNameMap.values());
}