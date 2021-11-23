public void refresh() {
    final org.openthinclient.common.model.Realm realm = ((org.openthinclient.common.model.Realm) (getLookup().lookup(org.openthinclient.common.model.Realm.class)));
    try {
        realm.refresh();
        for (final org.openide.nodes.Node node : getChildren().getNodes())
            if (node instanceof org.openthinclient.console.Refreshable)
                ((org.openthinclient.console.Refreshable) (node)).refresh();
            
        
        fireCookieChange();
    } catch (final org.openthinclient.ldap.DirectoryException e) {
        org.openide.ErrorManager.getDefault().notify(e);
    }
}