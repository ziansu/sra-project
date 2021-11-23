@java.lang.Override
public void updateSecond(double delta, int fps) {
    super.updateSecond(delta, fps);
    com.rpg.framework.core.Debugger.Write((("FPS : " + fps) + " "));
    com.rpg.framework.manager.MessageManager.getInstance().print();
}