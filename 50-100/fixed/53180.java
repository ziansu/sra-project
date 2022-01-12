@javafx.fxml.FXML
public void loadDataOfSpolka() {
    java.lang.String selectedSpolka = comboSpolkiList.getValue();
    dataOfOneSpolka.clear();
    for (com.gpw.grabber.data.Spolka spolka : data) {
        if ((selectedSpolka != null) && (selectedSpolka.equalsIgnoreCase(spolka.getSpolkaNazwa()))) {
            dataOfOneSpolka.add(spolka);
        }
    }
    tableOfOneSpolka.setItems(dataOfOneSpolka);
}