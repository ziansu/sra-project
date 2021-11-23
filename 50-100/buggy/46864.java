@java.lang.Override
public void keyTyped(com.kotcrab.vis.ui.widget.VisTextField textField, char c) {
    if ((script) == null)
        script = ((com.quexten.ravtech.scripts.lua.LuaJScript) (RavTech.scriptLoader.createScript("", null)));
    
    if ((c == '\n') || (c == '\r')) {
        script.loadChunk((("function init() \n " + (textField.getText())) + "\n end"));
        script.init();
        textField.setText("");
    }
}