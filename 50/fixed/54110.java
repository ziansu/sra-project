@java.lang.Override
public boolean isadmin(int userId, int groupId) {
    edu.iu.club.connect.model.GroupModel group = groupRepository.isadmin(userId, groupId);
    if (group == null) {
        return true;
    }
    return false;
}