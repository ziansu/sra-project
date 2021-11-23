@org.springframework.web.bind.annotation.RequestMapping(value = "/rest/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.usermanagement.model.User searchUser(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    return userRepository.findOne(id);
}