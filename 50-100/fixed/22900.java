@java.lang.Override
public info.smartkit.hairy_batman.domain.WxSimpleSubscriber process(final info.smartkit.hairy_batman.domain.WxSimpleSubscriber wxFoo) throws java.lang.Exception {
    info.smartkit.hairy_batman.batch.WxFooItemProcessor.LOG.info(("WxFooItemProcessor processing..." + wxFoo));
    new info.smartkit.hairy_batman.query.SogouSearchQuery(new info.smartkit.hairy_batman.domain.WxComplexSubscriber(wxFoo.getId(), wxFoo.getCode(), wxFoo.getStore(), null, wxFoo.getSubscribeId(), null, null)).parseWxOpenId();
    return wxFoo;
}