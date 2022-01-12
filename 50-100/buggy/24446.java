public static cs3500.music.view.ViewInterface getView(java.lang.String viewName, cs3500.music.model.EditorOperations model) throws java.lang.IllegalArgumentException {
    if (viewName == null) {
        throw new java.lang.IllegalArgumentException();
    }
    viewName = viewName.toLowerCase();
    switch (viewName) {
        case "visual" :
            return new cs3500.music.view.GuiViewFrame(model);
        case "audio" :
            try {
                return new cs3500.music.view.MidiViewImpl(model);
            } catch (javax.sound.midi.MidiUnavailableException e) {
                java.lang.System.err.println("Midi unavailable.");
            }
        default :
            throw new java.lang.IllegalArgumentException((("Given view, " + viewName) + ", does not exist."));
    }
}