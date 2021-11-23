private boolean mapDerefStatusCode(de.unibonn.iai.eis.diachron.datatypes.StatusCode statusCode) {
    if (statusCode == null) {
        return false;
    }else {
        switch (statusCode) {
            case SC303 :
            case HASH :
                return true;
            default :
                return false;
        }
    }
}