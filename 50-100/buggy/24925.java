public static void getAllGroups(final com.instructure.canvasapi.utilities.CanvasCallback<com.instructure.canvasapi.model.Group[]> callback) {
    if (com.instructure.canvasapi.utilities.APIHelpers.paramIsNull(callback))
        return ;
    
    com.instructure.canvasapi.utilities.CanvasCallback<com.instructure.canvasapi.model.Group[]> bridge = new com.instructure.canvasapi.utilities.ExhaustiveBridgeCallback(callback, new com.instructure.canvasapi.utilities.ExhaustiveBridgeCallback.ExhaustiveBridgeEvents() {
        @java.lang.Override
        public void performApiCallWithExhaustiveCallback(com.instructure.canvasapi.utilities.CanvasCallback callback, java.lang.String nextURL) {
            com.instructure.canvasapi.api.GroupAPI.getNextPageGroups(nextURL, callback);
        }

        @java.lang.Override
        public java.lang.Class classType() {
            return com.instructure.canvasapi.model.Group.class;
        }
    });
    bridge.readFromCache(com.instructure.canvasapi.api.GroupAPI.getAllGroupsCacheFilename());
    com.instructure.canvasapi.api.GroupAPI.getFirstPageGroups(callback);
}