private java.lang.String toString(int status) {
    switch (status) {
        case SUCCESS :
            return "SUCCESS";
        case FAILURE :
            return "FAILURE";
        case SKIP :
            return "SKIP";
        case SUCCESS_PERCENTAGE_FAILURE :
            return "SUCCESS WITHIN PERCENTAGE";
        case STARTED :
            return "STARTED";
        default :
            throw new java.lang.RuntimeException();
    }
}