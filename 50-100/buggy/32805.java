@java.lang.Override
public void process(java.lang.String json) {
    com.guhanjie.weixin.model.WeixinMedia t = com.alibaba.fastjson.JSONObject.parseObject(json, com.guhanjie.weixin.model.WeixinMedia.class);
    if (t != null) {
        wm.setMedia_id(t.getMedia_id());
        com.guhanjie.weixin.media.MediaKit.LOGGER.info("Success to post media:[{}].", t.getMedia_id());
    }else {
        com.guhanjie.weixin.media.MediaKit.LOGGER.error("Failed to post media.");
    }
}