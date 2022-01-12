public static int getSelectedIdentityId() {
    int selectedIdentity = de.hdm.itProjektSS17.client.gui.IdentityMarketChoice.ownOrgUnits.getSelectedIndex();
    if ((de.hdm.itProjektSS17.client.gui.IdentityMarketChoice.ownOrgUnits.getSelectedIndex()) == 0) {
        return de.hdm.itProjektSS17.client.gui.IdentityMarketChoice.person.getId();
    }else
        if ((de.hdm.itProjektSS17.client.gui.IdentityMarketChoice.ownOrgUnits.getSelectedIndex()) == 1) {
            return de.hdm.itProjektSS17.client.gui.IdentityMarketChoice.team.getId();
        }else
            if ((de.hdm.itProjektSS17.client.gui.IdentityMarketChoice.ownOrgUnits.getSelectedIndex()) == 2) {
                return de.hdm.itProjektSS17.client.gui.IdentityMarketChoice.unternehmen.getId();
            }
        
    
    return 0;
}