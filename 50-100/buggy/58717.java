public void oscEvent(muselightswitch.OscMessage msg) {
    if (msg.checkAddress("/muse/elements/jaw_clench")) {
        if (msg.get(0).booleanValue()) {
            if (this.done) {
                this.lightSwitch.toggleState();
                this.done = false;
            }
        }else {
            this.done = true;
        }
    }
}