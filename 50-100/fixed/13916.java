public void disconnect() {
    try {
        FX_Main.cn.close();
    } catch (java.sql.SQLException e) {
        java.lang.System.err.println(((e.getLocalizedMessage()) + " - Failed to disconnect."));
    } catch (java.lang.NullPointerException e) {
        java.lang.System.err.println(((e.getLocalizedMessage()) + " - FX_Main.cn is null."));
    } finally {
        fx.controller_Main.setConnectionIndicatorState(false);
    }
}