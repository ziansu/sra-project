@java.lang.Override
public void printReceipt(fr.pasteque.client.models.Receipt r) {
    fr.pasteque.client.utils.PastequePowaPos.getSingleton().startReceipt();
    super.printReceipt(r);
}