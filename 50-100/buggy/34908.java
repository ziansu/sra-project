private void initDoubleBJIcon() {
    com.badlogic.ashley.core.Entity bjIcon = gameItem.getChild(com.fd.etf.stages.GameScreenScript.DOUBLE_BJ_ICON).getEntity();
    if (gameStage.gameScript.fpc.haveBugJuiceDouble()) {
        com.fd.etf.stages.TransformComponent tc = bjIcon.getComponent(com.fd.etf.stages.TransformComponent.class);
        if (gameStage.gameScript.fpc.havePhoenix()) {
            tc.x = 117;
            tc.y = 675;
        }else {
            tc.x = 15;
            tc.y = 675;
        }
    }else {
        bjIcon.getComponent(com.fd.etf.stages.TransformComponent.class).x = FAR_FAR_AWAY_X;
    }
}