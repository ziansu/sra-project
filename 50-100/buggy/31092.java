public void setPcs(contextproject.audio.TrackProcessor tp) {
    this.tp = tp;
    contextproject.controllers.PlayerControlsController.pcs = new java.beans.PropertyChangeSupport(tp);
    tp.setPcc(this);
    contextproject.controllers.PlayerControlsController.pcs.addPropertyChangeListener("progress", new java.beans.PropertyChangeListener() {
        @java.lang.Override
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            musicBar.progressProperty().set(((double) (evt.getNewValue())));
        }
    });
}