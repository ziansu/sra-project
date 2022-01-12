@java.lang.Override
public boolean stop() {
    com.weibo.api.motan.util.MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, false);
    logger.warn("(｡・`ω´･) Motan has been closed by ICEREST !");
    return true;
}