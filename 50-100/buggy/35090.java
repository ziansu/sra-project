public edu.msg.ro.business.dto.UserDTO updateUser(edu.msg.ro.business.dto.UserDTO userDTO) throws edu.msg.ro.business.exception.BusinessException, edu.msg.ro.business.exception.TechnicalException {
    userValidator.validateUserUpdateData(userDTO);
    java.lang.String password = com.google.common.hash.Hashing.sha256().hashString(userDTO.getPassword(), java.nio.charset.StandardCharsets.UTF_8).toString();
    userDTO.setPassword(password);
    edu.msg.ro.persistence.entity.User initialUser = userDAO.findUserByUsername(userDTO.getUsername());
    userDTOMapper.mapToEntity(userDTO, initialUser);
    return userDTOMapper.mapToDTO(initialUser);
}