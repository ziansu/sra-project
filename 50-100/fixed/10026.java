private void validateEditing(com.webapplication.entity.AuctionItem auctionItem) throws java.lang.Exception {
    if ((auctionItem.getBidsNo()) != 0)
        throw new com.webapplication.exception.auctionitem.AuctionAlreadyInProgressException(com.webapplication.error.auctionitem.AuctionItemError.AUCTION_ALREADY_IN_PROGRESS);
    
    if (((auctionItem.getEndDate()) != null) && (new java.util.Date().after(auctionItem.getEndDate())))
        throw new com.webapplication.exception.auctionitem.AuctionExpiredException(com.webapplication.error.auctionitem.AuctionItemError.AUCTION_EXPIRED);
    
}