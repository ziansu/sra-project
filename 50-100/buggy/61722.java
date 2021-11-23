private void confirmDialog(final int exercise_id) {
    com.afollestad.materialdialogs.MaterialDialog dialog = new com.afollestad.materialdialogs.MaterialDialog.Builder(context).title("confirm").content(("Are you sure you want to delete it?" + (java.lang.String.valueOf(exercise_id)))).positiveText("OK").negativeText("CANCEL").cancelable(false).onPositive(new com.afollestad.materialdialogs.MaterialDialog.SingleButtonCallback() {
        @java.lang.Override
        public void onClick(@android.support.annotation.NonNull
        com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
        com.afollestad.materialdialogs.DialogAction which) {
            deleteExcise(exercise_id);
        }
    }).build();
    dialog.show();
}