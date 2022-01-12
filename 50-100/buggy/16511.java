private void fillSpecialitiesComboBox(java.lang.String departmentName) {
    switch (departmentName) {
        case "Computer science" :
            specialitiesComboBox.setItems(javafx.collections.FXCollections.observableArrayList(java.util.Arrays.asList("PZKS", "KSM", "MPUIK")));
            break;
        case "Foreign languages" :
            specialitiesComboBox.setItems(javafx.collections.FXCollections.observableArrayList(java.util.Arrays.asList("English", "Spanish", "German")));
            break;
        case "Mathematical" :
            specialitiesComboBox.setItems(javafx.collections.FXCollections.observableArrayList(java.util.Arrays.asList("Math", "Math", "Math")));
            break;
    }
}