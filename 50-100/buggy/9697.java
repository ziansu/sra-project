public static void back(de.hhu.propra16.coastal.tddt.ITDDTextArea taeditor, de.hhu.propra16.coastal.tddt.ITDDTextArea tatest, de.hhu.propra16.coastal.tddt.ITDDLabel lbstatus, javafx.scene.control.Button btback) {
    btback.setDisable(true);
    taeditor.setText(de.hhu.propra16.coastal.tddt.CompilerReport.previousCode);
    lbstatus.setText("RED");
    lbstatus.setId("red");
    de.hhu.propra16.coastal.tddt.TDDController.toTestEditor(taeditor, tatest);
    de.hhu.propra16.coastal.tddt.CompilerReport.target = CompileTarget.TEST;
    TDDTMenu.baby.test.setText(TDDTMenu.baby.oldTestText);
    TDDTMenu.baby.editor.setText(TDDTMenu.baby.oldEditorText);
}