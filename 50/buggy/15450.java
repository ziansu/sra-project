public void onClick(android.content.DialogInterface dialog, int id) {
    isSaved = true;
    recordedFilename = saveFile(finalFrom, finalToTemp, suggestedFilename);
    filenameView.setText(suggestedFilename);
    finalTo.delete();
    finalToTemp.renameTo(finalTo);
}