public void goPreviousPosition() {
    switch (positionManager.getCurrentLocatePositionType()) {
        case SUB_NODE :
            positionManager.setCurrentLocatePositionType(LocatePosition.NODE);
            screenFactory.show(com.mygdx.enums.ScreenEnum.findScreenEnum(positionManager.getCurrentNodeType().toString()));
            break;
        default :
            Gdx.app.log("MovingManager", "PositionEnum정보 오류");
    }
}