public static ua.teachme.model.User createUser(ua.teachme.dto.UserTO userTO) {
    return new ua.teachme.model.User(null, userTO.getName(), userTO.getPassword(), userTO.getEmail());
}