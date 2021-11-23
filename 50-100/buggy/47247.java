public com.Vshkole.fragments.BookAdditionalInfoFragment getAdditInfoFragment(int index) {
    com.Vshkole.entities.Entity currBook = (isBook) ? entity : opposite;
    com.Vshkole.entities.Entity currAnswerBook = (isBook) ? opposite : entity;
    if ((entity) == null)
        return null;
    
    return index == 0 ? createBookAdditFragment(currAnswerBook, false) : createBookAdditFragment(currBook, true);
}