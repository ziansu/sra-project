@org.springframework.web.bind.annotation.RequestMapping(value = "register", method = org.springframework.web.bind.annotation.RequestMethod.POST)
private de.mediapool.server.entities.users.domain.UserNodeDTO createUser(@org.springframework.web.bind.annotation.RequestBody
de.mediapool.server.entities.users.domain.UserNodeDTO userNodeDTO) {
    userNodeDTO.setId(java.util.UUID.randomUUID().toString());
    {
        de.mediapool.server.entities.users.domain.UserRoleNodeDTO userRoleUser = new de.mediapool.server.entities.users.domain.UserRoleNodeDTO();
        userRoleUser.setName("USER");
        userNodeDTO.getRoles().add(userRoleUser);
    }
    {
        de.mediapool.server.entities.users.domain.UserRoleNodeDTO userRoleUser = new de.mediapool.server.entities.users.domain.UserRoleNodeDTO();
        userRoleUser.setName("ADMIN");
        userNodeDTO.getRoles().add(userRoleUser);
    }
    return userRepository.save(userNodeDTO);
}