@java.lang.Override
public void updateUser(com.pineone.server.model.User user) {
    com.pineone.server.model.User userToUpdate = new com.pineone.server.model.User();
    userToUpdate.setId(user.getId());
    userToUpdate.setUid(user.getUid());
    userToUpdate.setPassword(user.getPassword());
    userToUpdate.setSex(user.getSex());
    userToUpdate.setName(user.getName());
    userToUpdate.setEmail(user.getEmail());
    getCurrentSession().update(userToUpdate);
}