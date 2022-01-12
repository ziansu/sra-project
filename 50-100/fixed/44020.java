private void setSportComboBoxData() {
    java.util.List<at.fhv.itb13.sportify.client.presentation.controller.SimpleSportDTO> sportList;
    sportList = at.fhv.itb13.sportify.client.communication.ServiceLocator.getInstance().getRemote(at.fhv.itb13.sportify.shared.communication.remote.ejb.SessionRemote.class).getSportRemote().getAllSimpleSports();
    if (sportList != null) {
        javafx.collections.ObservableList<at.fhv.itb13.sportify.client.presentation.controller.SimpleSportDTO> sportObservable = javafx.collections.FXCollections.observableArrayList();
        for (at.fhv.itb13.sportify.client.presentation.controller.SimpleSportDTO sport : sportList) {
            sportObservable.add(sport);
        }
        _sportComboBox.getItems().addAll(sportObservable);
        _sportComboBox.setValue(_sportComboBox.getItems().get(0));
    }
}