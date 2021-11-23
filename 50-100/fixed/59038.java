@java.lang.Override
public void save(com.estore.user.dto.LowerAgent agent) {
    com.estore.user.entity.User user = new com.estore.user.entity.User();
    user.setPhoneNumber(agent.getPhoneNumber());
    user.setPassword(agent.getPhoneNumber());
    user.setWechatNumber(agent.getWechatNumber());
    user.setName(agent.getName());
    user.setSupperAgentId(agent.getSuperAgentId());
    user.setEnabled(false);
    this.userMapper.insert(user);
}