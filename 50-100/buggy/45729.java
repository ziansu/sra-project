@java.lang.Override
protected void handleAttachment() throws games.strategy.engine.data.GameParseException {
    if ((canalDef) == null) {
        final java.util.SortedSet<java.lang.String> newWaterTerritories = new java.util.TreeSet<>();
        newWaterTerritories.add(attachmentAttachTo);
        tools.map.xml.creator.MapXmlHelper.getCanalDefinitionsMap().put(newCanalName, new tools.map.xml.creator.CanalTerritoriesTuple(newWaterTerritories, newLandTerritories));
    }else {
        canalDef.getWaterTerritories().add(attachmentAttachTo);
    }
    canalDef = null;
    newCanalName = null;
    newLandTerritories = new java.util.TreeSet<>();
    attachmentAttachTo = null;
}