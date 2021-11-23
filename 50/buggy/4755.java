@org.junit.Test
public void toJSON() {
    com.feilong.core.HttpMethodType httpMethodType = com.feilong.core.HttpMethodType.GET;
    com.feilong.tools.jsonlib.JsonUtilToBeanTest.LOGGER.info(com.feilong.tools.jsonlib.JsonUtil.toJSON(httpMethodType, null).toString(4, 4));
}