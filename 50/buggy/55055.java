public void loanBookTo(assignment.Book book, assignment.User user) {
    if ((book.getUserLoanedTo()) != null) {
        java.lang.System.out.println("This book has already been loaned.");
        return ;
    }
    user.loan(book);
    book.setLoanedTo(user);
}