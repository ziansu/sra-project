public void onClick(android.content.DialogInterface dialog, int id) {
    isSaved = true;
    recordedFilename = saveFile(finalFrom, finalToTemp, suggestedFilename, true);
    filenameView.setText(suggestedFilename);
    finalTo.delete();
    finalToTemp.renameTo(finalTo);
}