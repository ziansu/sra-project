@java.lang.Override
public void onError(org.rstudio.studio.client.server.ServerError error) {
    progressIndicator.onCompleted();
    globalDisplay_.showErrorMessage("Error Starting Shell", error.getUserMessage(), new org.rstudio.core.client.widget.Operation() {
        @java.lang.Override
        public void execute() {
            if ((observer_) != null)
                observer_.onShellTerminated();
            
        }
    });
}