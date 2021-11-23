@se.sjtu.formfoss.controller.RequestMapping(path = "/add")
@se.sjtu.formfoss.controller.ResponseBody
public java.lang.String userAdd(@se.sjtu.formfoss.controller.RequestParam
java.lang.String userName, @se.sjtu.formfoss.controller.RequestParam
java.lang.String userPassword, @se.sjtu.formfoss.controller.RequestParam
java.lang.String userEmail, @se.sjtu.formfoss.controller.RequestParam(required = false)
java.lang.String userPhone) {
    se.sjtu.formfoss.model.UserEntity newUser = new se.sjtu.formfoss.model.UserEntity();
    newUser.setUserName(userName);
    newUser.setUserPassword(userPassword);
    newUser.setUserEmail(userEmail);
    if (userPhone != null) {
        newUser.setUserPhone(userPhone);
    }
    userRepository.save(newUser);
    return "{\"message\": \"success\"}";
}