@java.lang.Override
public void updateUser(edu.cpp.cs580.data.User user) {
    edu.cpp.cs580.data.UserMap userMap = getUserMap();
    userMap.put(user.getId(), user);
    persistUserMap(userMap);
}