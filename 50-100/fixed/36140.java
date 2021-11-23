public void passFingerTableToNewNode(chord.MyNetwork modelObj, chord.Node previousPred) {
    java.lang.String ip = modelObj.addObject.get(1);
    int port = java.lang.Integer.parseInt(modelObj.addObject.get(2));
    chord.MyNetwork obj = new chord.MyNetwork();
    obj.command = "add_PassFingerTable";
    obj.fingerTable = fingerTable;
    obj.predecessor = previousPred;
    obj.successor = node;
    chord.Operation.sendRequest(ip, port, obj);
}