public void removeFromErrorsWarnings(insalmo.Parameter param) {
    if (this.errors.contains(param)) {
        this.errors.remove(param);
        this.errorWarningUpdateListener.actionPerformed(new java.awt.event.ActionEvent(this, java.awt.event.ActionEvent.ACTION_PERFORMED, null));
    }
    if (this.warnings.contains(param)) {
        this.warnings.remove(param);
        this.errorWarningUpdateListener.actionPerformed(new java.awt.event.ActionEvent(this, java.awt.event.ActionEvent.ACTION_PERFORMED, null));
    }
}