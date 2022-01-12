public void update(com.silkchina.common.service.UserDTO userDTO) {
    com.silkchina.common.service.User user = userMapper.getById(userDTO.getId());
    user.setUserName(userDTO.getUserName());
    user.setUserSex(userDTO.getUserSex());
    user.setPassword(userDTO.getPassword());
    user.setPhoneNumber(userDTO.getPhoneNumber());
    user.setCompanyId(userDTO.getCompanyId());
    user.setWeChatId(userDTO.getWeChatId());
    userMapper.update(user);
}