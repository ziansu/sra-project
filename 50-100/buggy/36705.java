public static void main(java.lang.String[] args) throws java.io.UnsupportedEncodingException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.math.BigDecimal value = new java.math.BigDecimal(219890700);
    onefengma.demo.rx.ReDemo.Test test = new onefengma.demo.rx.ReDemo.Test();
    test.name = "asdfasdfasdf";
    test.value = new java.math.BigDecimal(0);
    java.lang.String json = "{\"name\":\"asdfasdfasdf\",\"value\":219890700}";
    java.lang.System.out.println(("value:" + (com.alibaba.fastjson.JSON.toJSONString(test))));
}