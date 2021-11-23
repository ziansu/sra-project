public void setUp() {
    com.kritsit.casetracker.client.domain.services.IConnectionService connection = new com.kritsit.casetracker.client.domain.services.ServerConnection();
    user = new com.kritsit.casetracker.client.domain.datastructures.Staff("inspector", "inspector", "inspector", "Inspectorate", "manager", com.kritsit.casetracker.client.domain.datastructures.Permission.EDITOR);
    editor = new com.kritsit.casetracker.client.domain.services.Editor(user, connection);
}