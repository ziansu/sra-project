@javax.ws.rs.PUT
public javax.ws.rs.core.Response updateUser(org.obiba.agate.web.model.Agate.UserDto userDto) {
    userService.getUser(id);
    org.obiba.agate.domain.User user = dtos.fromDto(userDto);
    userService.save(user);
    return javax.ws.rs.core.Response.noContent().build();
}