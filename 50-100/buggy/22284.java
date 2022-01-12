private void actionButtonEdit() {
    if (com.leofesk.quicktodomanager.controller.DataBaseWorker.isCorrectNote(com.leofesk.quicktodomanager.view.NoteEditFrame.textFieldTaskName.getText(), com.leofesk.quicktodomanager.view.NoteEditFrame.textArea.getText(), com.leofesk.quicktodomanager.view.NoteEditFrame.textFieldDeadlineDate.getText())) {
        com.leofesk.quicktodomanager.controller.DataBaseWorker.editNoteFromTable(com.leofesk.quicktodomanager.view.NoteEditFrame.textFieldTaskName.getText(), com.leofesk.quicktodomanager.view.NoteEditFrame.textArea.getText(), com.leofesk.quicktodomanager.view.NoteEditFrame.textFieldDeadlineDate.getText());
        com.leofesk.quicktodomanager.controller.DataBaseWorker.showMessage((("Task [" + (com.leofesk.quicktodomanager.view.NoteEditFrame.textFieldTaskName.getText())) + "] successfully updated."));
    }else {
        com.leofesk.quicktodomanager.controller.DataBaseWorker.showMessage("Task was not updated. Title, text and deadline can't be empty. [CODE:V_NE_001]");
    }
    dispose();
}