public java.lang.Integer toInteger() {
    switch (this) {
        case SHARED_BY_ME_WITH_EVERYONE :
            return 0;
        case SHARED_BY_ME_WITHIN_GROUPS :
            return 1;
        case SHARED_BY_ME_WITH_MY_DEVICES :
            return 2;
        case NOT_SHARED :
            return 3;
        case SHARED_WITH_ME_WITH_EVERYONE :
            return 4;
        case SHARED_WITH_ME_WITHIN_GROUPS :
            return 5;
        case UNKNOWN :
            return 6;
        default :
            return -1;
    }
}