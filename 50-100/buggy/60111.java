private void showPrintPreOrderDialog(final int position, final com.singular.dnorman.douglasdalehandheldapp.Objects.PreOrderList preOrders, final android.content.Context DebtorContext) {
    com.singular.dnorman.douglasdalehandheldapp.Objects.PreOrder temp = null;
    for (com.singular.dnorman.douglasdalehandheldapp.Objects.PreOrder po : preOrders) {
        if (((po.AskedToPrint) == 0) && ((po.Printed) == 0)) {
            temp = po;
        }
    }
    if (temp != null) {
        showPrintPreOrderDialog(temp, position, preOrders, DebtorContext);
    }else {
        transactionChoice(DebtorContext, position);
    }
}