public void setValue(uk.co.nickthecoder.itchy.Costume costume) {
    this.costume = costume;
    if (costume != null) {
        img.setImage(costume.getThumbnail());
        label.setText(costume.getName());
    }
    this.removeStyle("error");
    for (uk.co.nickthecoder.itchy.gui.ComponentValidator validator : validators) {
        if (!(validator.isValid())) {
            this.addStyle("error");
        }
    }
    for (uk.co.nickthecoder.itchy.gui.ComponentChangeListener listener : changeListeners) {
        listener.changed();
    }
}