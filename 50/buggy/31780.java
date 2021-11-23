public co.smartreceipts.android.model.Receipt insertReceiptSerial(co.smartreceipts.android.model.Trip parent, co.smartreceipts.android.model.Receipt receipt, java.io.File newFile) throws android.database.SQLException {
    receipt.setFile(newFile);
    return insertReceiptHelper(receipt);
}