public static cs3500.music.view.ViewInterface getView(java.lang.String viewName, cs3500.music.model.EditorOperations model) throws java.lang.IllegalArgumentException, javax.sound.midi.MidiUnavailableException {
    if (viewName == null) {
        throw new java.lang.IllegalArgumentException();
    }
    viewName = viewName.toLowerCase();
    switch (viewName) {
        case "visual" :
            return new cs3500.music.view.GuiViewFrame(model);
        case "audio" :
            return new cs3500.music.view.MidiViewImpl(model);
        default :
            throw new java.lang.IllegalArgumentException((("Given view, " + viewName) + ", does not exist."));
    }
}