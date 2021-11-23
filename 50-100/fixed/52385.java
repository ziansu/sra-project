public com.entity.UserEntity findByAccountNumberAndPassword(java.lang.String accountNumber, java.lang.String password) {
    com.entity.UserEntity userEntity = new com.entity.UserEntity();
    userEntity.setPassword(password);
    java.util.List list = userDao.findByExample(userEntity);
    return list.isEmpty() ? null : ((com.entity.UserEntity) (list.get(0)));
}