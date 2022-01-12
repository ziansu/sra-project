@java.lang.Override
public boolean start() {
    frame.sdk.fetion.kit.FetionKit.init(fromMobile, password);
    return true;
}