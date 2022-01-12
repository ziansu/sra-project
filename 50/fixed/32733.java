private void clearProgram() {
    com.rfo.basic.Basic.clearProgram();
    com.rfo.basic.Editor.ProgramFileName = "";
    setTitle(com.rfo.basic.Editor.ProgramFileName);
    com.rfo.basic.Editor.mText.setText(com.rfo.basic.Editor.DisplayText);
}