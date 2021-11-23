private void updateMetadata() {
    while (shouldShowUpdates_) {
        org.micromanager.data.Image image = null;
        while (!(updateQueue_.isEmpty())) {
            image = updateQueue_.poll();
        } 
        if (image == null) {
            try {
                java.lang.Thread.sleep(100);
            } catch (java.lang.InterruptedException e) {
                if (!(shouldShowUpdates_)) {
                    return ;
                }
            }
            continue;
        }
        imageChangedUpdate(image);
    } 
}