@java.lang.Override
public javafx.collections.ObservableList<de.bht.fpa.mail.gruppe15.model.data.Email> search(javafx.collections.ObservableList<de.bht.fpa.mail.gruppe15.model.data.Email> emailList, java.lang.String input) {
    final javafx.collections.ObservableList<de.bht.fpa.mail.gruppe15.model.data.Email> filteredList;
    filteredList = emailManager.search(emailList, input);
    return filteredList;
}