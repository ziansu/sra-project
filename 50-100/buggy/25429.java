@javax.annotation.PostConstruct
public void setupPickList() {
    java.util.List<java.lang.String> typesSource = new java.util.ArrayList<java.lang.String>();
    java.util.List<java.lang.String> typesTarget = new java.util.ArrayList<java.lang.String>();
    typesSource.add("Gruppenphase");
    typesSource.add("2 Gruppenphasen");
    typesSource.add("KO-System");
    types = new org.primefaces.model.DualListModel<java.lang.String>(typesSource, typesTarget);
    updateTeamList();
}