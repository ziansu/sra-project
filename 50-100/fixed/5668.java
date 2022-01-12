@org.springframework.web.bind.annotation.PutMapping(value = "/{id}")
public java.lang.String update(@itn.issuemanager.config.LoginUser
itn.issuemanager.domain.User loginUser, @org.springframework.web.bind.annotation.PathVariable
long id, itn.issuemanager.domain.User updatedUser, java.lang.String newPassword) throws itn.issuemanager.domain.ForbiddenTypeException {
    itn.issuemanager.domain.User user = userRepository.findOne(id);
    if (!(loginUser.isSameUser(user))) {
        throw new itn.issuemanager.domain.ForbiddenTypeException();
    }
    if (user.isPassword(updatedUser.getPassword()))
        itn.issuemanager.controller.UserController.log.debug("기존 비밀번호가 틀렸습니다.");
    
    user.update(updatedUser, newPassword);
    userRepository.save(user);
    return "redirect:/";
}