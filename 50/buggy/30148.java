public void onClick(android.content.DialogInterface dialog, int whichButton) {
    newTemp.behaviours.get(index).bName = bName.getText().toString();
    newTemp.behaviours.get(index).type = spinner.getSelectedItemPosition();
    updateBehaviours();
}