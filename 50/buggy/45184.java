@org.springframework.transaction.annotation.Transactional(value = "singleTransactionManager", rollbackFor = java.lang.Exception.class)
public void createNewCatAndSendMsg(com.ly.gproject.example.dao.model.Cat catObject) throws java.lang.Exception {
    java.lang.String key = "catTable-name-" + (catObject.getName());
    catMapper.insert(catObject);
    MQUtils.INSTANCE.sendMq(topic, com.ly.gproject.example.common.utils.GsonUtil.toJson(catObject), key);
}