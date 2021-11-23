@java.lang.Override
public com.tim.gaea2.domain.service.UserVO getUserVoByUserId(long id) {
    com.tim.gaea2.domain.entity.UserPO userPO = userMapper.selectByPrimaryKey(id);
    com.tim.gaea2.domain.service.UserVO userVO = new com.tim.gaea2.domain.service.UserVO();
    userVO.setId(userPO.getId());
    userVO.setUserName(userPO.getUserName());
    userVO.setPassword(userPO.getPassword());
    userVO.setState(userPO.getState());
    return userVO;
}