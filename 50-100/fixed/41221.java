public fi.metatavu.edelphi.domainmodel.panels.Panel update(fi.metatavu.edelphi.domainmodel.panels.Panel panel, java.lang.String name, java.lang.String description, fi.metatavu.edelphi.domainmodel.panels.PanelAccessLevel accessLevel, fi.metatavu.edelphi.domainmodel.panels.PanelState state, fi.metatavu.edelphi.domainmodel.users.User modifier) {
    panel.setName(name);
    panel.setDescription(description);
    panel.setAccessLevel(accessLevel);
    panel.setState(state);
    panel.setLastModified(new java.util.Date());
    panel.setLastModifier(modifier);
    return persist(panel);
}