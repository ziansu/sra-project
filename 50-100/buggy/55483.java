@java.lang.Override
public void write(com.badlogic.gdx.utils.Json json) {
    super.write(json);
    if ((com.bladecoder.engine.util.SerializationHelper.getInstance().getMode()) == (com.bladecoder.engine.util.SerializationHelper.Mode.MODEL)) {
    }else {
        json.writeValue("currentFrameIndex", currentFrameIndex);
        json.writeValue("faTween", faTween, ((faTween) == null ? null : com.bladecoder.engine.anim.FATween.class));
    }
}