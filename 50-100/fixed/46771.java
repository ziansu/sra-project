@java.lang.Override
public void refreshRouter() {
    final me.chanjar.weixin.mp.api.WxMpMessageRouter newRouter = new me.chanjar.weixin.mp.api.WxMpMessageRouter(this.wxMpService);
    newRouter.rule().handler(this.logHandler).next();
    newRouter.rule().async(false).msgType(WxConsts.XML_MSG_EVENT).event(WxConsts.EVT_SUBSCRIBE).handler(this.subscribeHandler).end();
    newRouter.rule().async(false).handler(this.msgHandler).end();
    this.router = newRouter;
}