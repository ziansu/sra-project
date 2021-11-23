@org.springframework.web.bind.annotation.RequestMapping(value = "/users")
public java.util.List<com.revature.aes.beans.User> getUsers() {
    java.util.List<com.revature.aes.beans.User> listOfUsers = createUserList();
    return listOfUsers;
}