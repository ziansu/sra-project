@org.springframework.transaction.annotation.Transactional
public mycai.pojo.User getUserByWechatId(java.lang.String fromUserName) {
    mycai.pojo.User user = userDao.getUserByWechatId(fromUserName);
    return user;
}