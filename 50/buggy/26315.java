private static void init() {
    com.acupt.util.BeanFactor.putBeansByClass(com.acupt.util.JedisUtil.getInstance().getJedis("127.0.0.1", 6379));
}