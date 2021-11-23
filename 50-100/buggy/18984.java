public void testEpgClassify() {
    com.caucho.hessian.client.HessianProxyFactory proxy = new com.caucho.hessian.client.HessianProxyFactory();
    try {
        com.laudandjolynn.mytv.service.JolynnTv tv = ((com.laudandjolynn.mytv.service.JolynnTv) (proxy.create(com.laudandjolynn.mytv.service.JolynnTv.class, com.laudandjolynn.mytv.HessianTest.url)));
        java.lang.String classify = tv.getMyTvClassify();
        com.alibaba.fastjson.JSONArray array = com.alibaba.fastjson.JSON.parseArray(classify);
        java.lang.System.out.println(array);
        assertTrue(((array.size()) == 6));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}