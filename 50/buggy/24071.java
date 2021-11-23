public void showConfirmDelete() {
    android.app.DialogFragment dialog = new com.tanona.bill.positiveplasma.ConfirmDelete();
    dialog.show(getFragmentManager(), "ConfirmDelete");
    onDialogPositiveClick(dialog);
}