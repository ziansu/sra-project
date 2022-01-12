@java.lang.Override
protected boolean parseExtElement(sdk.weixin.msg.parser.xml.Element element) {
    if (super.parseExtElement(element)) {
        return true;
    }
    sdk.weixin.msg.AuthMessage msg = castMessage(sdk.weixin.msg.AuthMessage.class);
    switch (element.getName()) {
        case sdk.weixin.msg.parser.Constants.ELE_AUTH_FROM_APP_ID :
            msg.setActionAppID(element.getValue());
            break;
        default :
            break;
    }
    return false;
}