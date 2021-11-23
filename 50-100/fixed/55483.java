@java.lang.Override
public void write(com.badlogic.gdx.utils.Json json) {
    super.write(json);
    if ((com.bladecoder.engine.util.SerializationHelper.getInstance().getMode()) == (com.bladecoder.engine.util.SerializationHelper.Mode.MODEL)) {
    }else {
        json.writeValue("currentFrameIndex", currentFrameIndex);
        if ((faTween) != null)
            json.writeValue("faTween", faTween);
        
    }
}