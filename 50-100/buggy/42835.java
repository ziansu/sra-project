@java.lang.Override
public java.lang.String run(org.hyperledger.java.shim.ChaincodeStub stub, java.lang.String function, java.lang.String[] args) {
    switch (function) {
        case "init" :
        case "setMap" :
            mapChaincode = args[0];
            break;
        case "put" :
            stub.invokeChaincode(mapChaincode, function, toByteStringList(args), "");
        default :
            break;
    }
    return null;
}