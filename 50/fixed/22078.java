@java.lang.Override
public void show() {
    hideTime = (java.lang.System.currentTimeMillis()) + (displayTime);
    guiNode.attachChild(overlay);
}