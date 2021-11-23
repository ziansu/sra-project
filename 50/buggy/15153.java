@play.db.jpa.Transactional(readOnly = true)
public play.mvc.Result findUserByUsername(java.lang.String username) {
    if (!(userService.userExistsByUsername(username))) {
        throw new org.iatoki.judgels.play.apis.JudgelsAPINotFoundException();
    }
    org.iatoki.judgels.jophiel.User user = userService.findUserByJid(username);
    return okAsJson(createUserV1FromUser(user));
}