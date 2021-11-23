public static ua.teachme.model.User createUser(ua.teachme.dto.UserTO userTO) {
    return new ua.teachme.model.User(userTO.getId(), userTO.getName(), userTO.getPassword(), userTO.getEmail());
}