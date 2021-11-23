@java.lang.Override
public com.dungeoncrawlers.beans.User authenticateUser(com.dungeoncrawlers.dto.UserDTO userDto) {
    com.dungeoncrawlers.beans.User user = daoimpl.getUser(userDto.getEmail(), userDto.getPassword());
    if (user == null)
        return null;
    
    java.lang.System.out.println(user.toString());
    userDto.setAuthenticated(true);
    return user;
}