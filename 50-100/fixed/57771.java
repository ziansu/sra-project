@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void handle(final javafx.event.ActionEvent e) {
    listyyy = new java.util.ArrayList(MainController.initializeRandomPatterns(5, 10));
    if (!(listy.isEmpty()))
        listy.clear();
    
    for (int i = 0; i < (listyyy.size()); i++) {
        listy.add(listyyy.get(i).pattern);
    }
}