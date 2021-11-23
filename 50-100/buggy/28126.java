public javafx.collections.ObservableList<client.entity.Specialist> getSpecialist(java.util.ArrayList<client.entity.Specialist> list) {
    javafx.collections.ObservableList<client.entity.Specialist> specialists = javafx.collections.FXCollections.observableArrayList();
    for (int i = 1; i < (list.size()); i++) {
        specialists.add(list.get(i));
    }
    return specialists;
}