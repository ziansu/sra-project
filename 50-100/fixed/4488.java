@java.lang.Override
public void run() {
    club.mytree.VkClient vk = new club.mytree.VkClient();
    java.lang.String idis = vk.getUsersInGroup(Main.GROUP_NAME);
    java.lang.System.out.println(idis);
    int[] users = club.mytree.VkClient.parseUsersInGroup(idis);
    java.lang.String online = vk.isUsersOnline(users);
    java.lang.System.out.println(online);
    java.util.List<club.mytree.UserOnline> uo = club.mytree.VkClient.parseOnlineUsers(online);
    club.mytree.SQLiteConnection sql = new club.mytree.SQLiteConnection(Main.GROUP_NAME, false);
    sql.update(uo);
}