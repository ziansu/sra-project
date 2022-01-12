public final void saveSettings() {
    buildings_tools.ToolSettings.saveTags(tagsModel.getTags());
    buildings_tools.ToolSettings.setBBMode(cBigMode.isSelected());
    buildings_tools.ToolSettings.setSoftCursor(cSoftCur.isSelected());
}