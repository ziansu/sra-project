@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    timeManager.plusMinute(15);
    soundManager.setSoundByUseAndPlay("move_arrow");
    positionManager.setCurrentPositionType(PositionEnum.SUB_NODE);
    positionManager.setCurrentSubNodeName(dungeonPath);
    screenFactory.show(ScreenEnum.DUNGEON);
    storySectionManager.triggerNextSectionEvent(EventTypeEnum.MOVE_SUB_NODE, dungeonPath);
    storySectionManager.triggerNextSectionEvent(EventTypeEnum.MOVE_SUB_NODE_BY_TIME, dungeonPath);
    eventManager.triggerSpecialEvent(EventTypeEnum.DONT_GO_BUILDING, dungeonPath);
}