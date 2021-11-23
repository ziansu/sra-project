public void disconnect() {
    try {
        if (!(FX_Main.cn.isClosed())) {
            FX_Main.cn.close();
            fx.controller_Main.setConnectionIndicatorState(false);
        }
    } catch (java.sql.SQLException e) {
        java.lang.System.err.println(((e.getLocalizedMessage()) + " - Failed to disconnect."));
    } catch (java.lang.NullPointerException e) {
        java.lang.System.err.println(((e.getLocalizedMessage()) + " - FX_Main.cn is null."));
    }
}