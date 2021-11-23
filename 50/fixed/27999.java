@org.springframework.web.bind.annotation.RequestMapping(path = "/api/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.lmig.reciply.AppUser login(@org.springframework.web.bind.annotation.RequestBody
com.lmig.reciply.AppUser user) {
    java.lang.String pwd = utils.hashPassword(user.password);
    return userRepository.findByUserIdAndPassword(user.userId, pwd);
}