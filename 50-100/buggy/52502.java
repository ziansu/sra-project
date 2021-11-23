@java.lang.Override
public void perform(data.AdvancedData data) {
    if (((controller.EventHandler.getInstance().lastUIEvent) == (this)) && (!(executed))) {
        executed = true;
        common.Log.toFile(((("Undo " + (states)) + " States to ") + (common.Log.goBack(states))));
    }else {
        executed = false;
    }
}