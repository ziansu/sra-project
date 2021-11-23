public void onClick(android.content.DialogInterface dialog, int which) {
    newEntryExerciseId = which;
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("newEntryExerciseId", java.lang.Integer.toString(newEntryExerciseId));
    getTargetFragment().onActivityResult(getTargetRequestCode(), pl.edu.wat.gymnotes.ChooseExerciseDialog.REQUEST_CODE, intent);
}