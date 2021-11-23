public org.cats.stock.domain.Receipt saveReceipt(org.cats.stock.domain.Receipt receipt) {
    receipt = receiptRepository.save(receipt);
    for (org.cats.stock.domain.ReceiptLine receiptLine : receipt.getReceiptLines()) {
        receiptLineItemRepository.save(receiptLine);
    }
    if (!(receipt.isDraft())) {
        postingService.post(receipt);
    }
    return receipt;
}