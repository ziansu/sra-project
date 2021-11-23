public com.racing.model.po.Manager getByUserNameAndPassword(java.lang.String userName, java.lang.String password) {
    password = com.racing.util.EncryptUtil.md5AndSha1Upcase(password);
    com.racing.model.po.ManagerExample example = new com.racing.model.po.ManagerExample();
    example.createCriteria().andUserNameEqualTo(password).andPasswordEqualTo(password);
    java.util.List<com.racing.model.po.Manager> list = this.mapper.selectByExample(example);
    if (org.apache.commons.collections.CollectionUtils.isNotEmpty(list)) {
        return list.get(0);
    }
    return null;
}