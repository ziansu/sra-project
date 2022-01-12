public void setEditingObject(de.mirkosertic.gameengine.core.EventSheet aObject) {
    clear();
    addTitleLevel1("Event Sheet");
    addTitleLevel2("Common properties");
    addTextInputfieldPropertyEditor("Name", aObject.nameProperty(), new de.mirkosertic.gameengine.web.GameObjectEditor.StringStringConverter());
    de.mirkosertic.gameengine.web.EventsheetEditorHTMLElement theEventsheetEditor = de.mirkosertic.gameengine.web.EventsheetEditorHTMLElement.create();
    theEventsheetEditor.bindTo(aObject);
    tabbedPaneHTMLElement.addTab("Event sheet", theEventsheetEditor);
}