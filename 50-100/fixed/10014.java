@java.lang.Override
@org.springframework.web.bind.annotation.RequestMapping(value = "/adduser")
public api.ConfirmationMessage addUser(@org.springframework.web.bind.annotation.RequestParam(value = "userTypeId")
int userTypeId, @org.springframework.web.bind.annotation.RequestParam(value = "calamityAssigneeId")
int calamityAssigneeId, @org.springframework.web.bind.annotation.RequestParam(value = "buildingId")
int buildingId, @org.springframework.web.bind.annotation.RequestParam(value = "username")
java.lang.String username, @org.springframework.web.bind.annotation.RequestParam(value = "password")
java.lang.String password, @org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email, @org.springframework.web.bind.annotation.RequestParam(value = "city")
java.lang.String city, @org.springframework.web.bind.annotation.RequestParam(value = "token")
java.lang.String token) {
    return userLogic.addUser(userTypeId, calamityAssigneeId, buildingId, username, password, email, city, token);
}