public static com.mdsgpp.eef.controller.StateConroller getInstance(android.content.Context contextActivity) {
    if ((com.mdsgpp.eef.controller.StateConroller.instance) == null) {
        com.mdsgpp.eef.controller.StateConroller.instance = new com.mdsgpp.eef.controller.StateConroller(contextActivity);
    }else {
    }
    return com.mdsgpp.eef.controller.StateConroller.instance;
}