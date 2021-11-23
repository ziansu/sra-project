public java.util.List<com.silkchina.common.service.UserDTO> find(com.silkchina.common.service.UserDTO userDTO, int page, int rows) {
    com.silkchina.common.service.PageHelper.startPage(page, rows);
    return userMapper.find(userDTO.getUserName(), java.lang.String.valueOf(userDTO.getCompanyId()), userDTO.getWeChatId(), userDTO.getStatus());
}