@java.lang.Override
public void execute() {
    org.wwarn.mapcore.client.utils.MapLoadUtil.loadMapApi(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            loadVisualisationApi();
        }
    });
}