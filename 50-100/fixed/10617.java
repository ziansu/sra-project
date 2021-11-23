public static void editNoteFromTable(java.lang.String title, java.lang.String text, java.lang.String deadline) {
    com.leofesk.quicktodomanager.model.Database.updateCurrentNoteFromDatabase(com.leofesk.quicktodomanager.controller.DataBaseWorker.currentNoteID, title, text, deadline, com.leofesk.quicktodomanager.controller.DataBaseWorker.note.getCreatedTime(), com.leofesk.quicktodomanager.controller.DataBaseWorker.note.getEndTime(), com.leofesk.quicktodomanager.controller.DataBaseWorker.note.getStatus());
    java.lang.System.out.println(com.leofesk.quicktodomanager.controller.DataBaseWorker.note.getStatus());
    com.leofesk.quicktodomanager.controller.DataBaseWorker.updateTableData();
}