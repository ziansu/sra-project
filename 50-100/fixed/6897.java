public void onClick(android.content.DialogInterface dialog, int id) {
    int newActionId = com.ha81dn.webausleser.backend.DatabaseHandler.getNewId(db, "actions");
    copyAction(db, a.getId(), newActionId, sortNr, com.ha81dn.webausleser.backend.DatabaseHandler.getUniqueCopiedActionName(activity, db, input.getText().toString().trim(), com.ha81dn.webausleser.MainActivity.sourceId), idShow, false);
    com.ha81dn.webausleser.MainActivity.appActionMode.finish();
    db.close();
    com.ha81dn.webausleser.MainActivity.displaySection(activity, "SOURCE", idShow, null, newActionId);
}