@java.lang.Override
public boolean handleMessage(com.badlogic.gdx.ai.msg.Telegram telegram) {
    if ((telegram.message) == (dhbw.karlsruhe.it.solar.core.solar.SolarMessageType.GAME_SCALE_CHANGED)) {
        updateScale();
    }
    return false;
}