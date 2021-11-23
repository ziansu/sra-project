@java.lang.Override
@org.springframework.transaction.annotation.Transactional(rollbackFor = com.wang.michael.online_shop.exception.UserNotFound.class)
public com.wang.michael.online_shop.model.User save(com.wang.michael.online_shop.model.User user) {
    if ((user.getId()) != null) {
        com.wang.michael.online_shop.model.User oldUser = userRepository.findOne(user.getId());
        user.setCreatedDateTime(oldUser.getCreatedDateTime());
        user.setUpdatedDateTime(new org.joda.time.DateTime());
        user.setPassword(oldUser.getPassword());
    }else {
        user.setCreatedDateTime(new org.joda.time.DateTime());
        user.setPassword("password");
    }
    return userRepository.save(user);
}