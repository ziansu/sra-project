private void validateBorrowHistoryItem(cgk.bibliothouris.learning.application.transferobject.BorrowHistoryItemTO borrowHistoryItemTO, cgk.bibliothouris.learning.service.entity.Book book, cgk.bibliothouris.learning.service.entity.Member member) {
    java.lang.Boolean isEndDateAfterStartDate = false;
    java.lang.Boolean isDateInvalid = (borrowHistoryItemTO.getEndDate()) == null;
    if (!isDateInvalid) {
        isEndDateAfterStartDate = borrowHistoryItemTO.getEndDate().isBefore(borrowHistoryItemTO.getStartDate());
    }
    java.lang.Boolean isBookInvalid = book == null;
    java.lang.Boolean isMemberInvalid = member == null;
    if ((isEndDateAfterStartDate || isBookInvalid) || isMemberInvalid)
        throw new cgk.bibliothouris.learning.service.exception.ValidationException("The borrow history item is invalid!");
    
}