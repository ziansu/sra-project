public static com.ctrip.zeus.support.AppSlbDo toAppSlbDo(com.ctrip.zeus.support.AppSlb e) {
    return new com.ctrip.zeus.support.AppSlbDo().setAppName(e.getAppName()).setSlbName(e.getSlbName()).setSlbVirtualServerName(e.getVirtualServer().getName()).setPath(e.getPath()).setRewrite(e.getRewrite()).setPriority(e.getPriority());
}