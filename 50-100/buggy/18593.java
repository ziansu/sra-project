private boolean isPortInRunning(java.lang.Integer port) {
    java.net.ServerSocket s = null;
    try {
        s = new java.net.ServerSocket(port);
    } catch (java.io.IOException e) {
        com.up.sim.service.ResponseService.logger.info("端口已被其他程序使用", e);
        return true;
    }
    try {
        s.close();
    } catch (java.io.IOException e) {
        com.up.sim.service.ResponseService.logger.info("关闭端口", e);
    }
    return false;
}