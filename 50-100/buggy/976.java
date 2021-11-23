static TorMessage.Type toEnum(int id) {
    switch (id) {
        case 0 :
            return TorMessage.Type.CREATE;
        case 1 :
            return TorMessage.Type.CREATED;
        case 2 :
            return TorMessage.Type.AES_REQUEST;
        case 3 :
            return TorMessage.Type.AES_RESPONSE;
        case 4 :
            return TorMessage.Type.EXTEND;
        case 5 :
            return TorMessage.Type.EXTENDED;
        case 6 :
            return TorMessage.Type.RELAY;
        case 7 :
            return TorMessage.Type.RELAYED;
        case 8 :
            return TorMessage.Type.BEGIN;
        case 9 :
            return TorMessage.Type.DATA;
        case 10 :
            return TorMessage.Type.TEARDOWN;
        default :
            java.lang.System.out.println(("BAD: " + (java.lang.Integer.toString(id))));
            return TorMessage.Type.BEGIN;
    }
}