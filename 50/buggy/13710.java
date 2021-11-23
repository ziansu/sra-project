@java.lang.Override
public void handleEvent(org.eclipse.swt.widgets.Event e) {
    if (searchField.getText().equals("поиск..."))
        searchField.setText("");
    
}