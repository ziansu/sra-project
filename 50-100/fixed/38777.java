@java.lang.Override
public void update(int index, ca.patricklam.judodb.client.ClientData cd, java.lang.Boolean value) {
    java.lang.StringBuffer edits = new java.lang.StringBuffer();
    edits.append(((((cd.getID()) + ",Ssolde,") + (value ? "1" : "0")) + ";"));
    cd.getServiceFor(currentSession).setSolde(value);
    pushEdit(edits.toString());
}