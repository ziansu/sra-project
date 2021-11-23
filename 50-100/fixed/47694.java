public void countBlockCategoriesForStage() {
    controlBlocksForStage = 0;
    dataBlocksForStage = 0;
    eventsBlocksForStage = 0;
    looksBlocksForStage = 0;
    moreBlocksBlocksForStage = 0;
    motionBlocksForStage = 0;
    operatorsBlocksForStage = 0;
    penBlocksForStage = 0;
    sensingBlocksForStage = 0;
    soundBlocksForStage = 0;
    org.json.simple.JSONArray scripts = FileUtils.getJSONArrayAttribute(jsonObj, "scripts");
    processScripts(scripts);
}