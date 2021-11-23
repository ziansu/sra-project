@java.lang.Override
public void onEnable() {
    mc.gameSettings.keyBindAttack.pressed = false;
    wurst.events.add(tk.wurst_client.events.listeners.UpdateListener.class, this);
}