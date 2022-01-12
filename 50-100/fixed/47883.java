public void doUndo(android.view.View v) {
    act.askOk(A.undo, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            dialog.cancel();
            act.progress(true);
            A.db.changeStatus(A.lastTxRow, A.TX_CANCEL, null);
            org.rcredits.pos.A.executeAsyncTask(new org.rcredits.pos.Act.Tx(), A.lastTxRow);
        }
    });
}