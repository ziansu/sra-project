@java.lang.Override
public void register(com.bluenimble.apps.sdk.ui.effects.Effect effect) {
    effects.put(effect.id().toLowerCase(), effect);
}