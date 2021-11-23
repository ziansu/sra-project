@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (saveButton)) {
        new org.horrgs.texteditor.windows.TESave(textEditorArea, false, absoluteFilePath, false, jFrame);
    }else
        if ((e.getSource()) == (newButton)) {
            new org.horrgs.texteditor.windows.TENew(textEditorArea);
        }else
            if ((e.getSource()) == (openDoc)) {
                new org.horrgs.texteditor.windows.TESave(textEditorArea, true, absoluteFilePath, true, jFrame);
            }
        
    
}