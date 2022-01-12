private void actionButtonEditForToolBar(java.awt.event.ActionEvent evt) {
    noteEditFrame.dispose();
    com.leofesk.quicktodomanager.controller.DataBaseWorker.addNoteToEditFrame();
    noteEditFrame.setVisible(true);
}