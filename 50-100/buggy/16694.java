public void newItem(final java.lang.String ptoken, final boolean pissueEvent, final boolean preplaceState) {
    if (pissueEvent) {
        com.google.gwt.event.logical.shared.ValueChangeEvent.fire(this, ptoken);
    }else {
        if (this.setToken(ptoken)) {
            if (preplaceState) {
                com.wallissoftware.pushstate.client.PushStateHistorianImpl.replaceState(this.relativePath, this.token);
            }else {
                com.wallissoftware.pushstate.client.PushStateHistorianImpl.pushState(this.relativePath, this.token);
            }
        }
    }
}