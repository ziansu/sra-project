public static com.tbaehr.sharewifi.model.viewmodel.WiFiNetwork.ShareStatus fromInteger(java.lang.Integer integer) {
    switch (integer) {
        case 0 :
            return com.tbaehr.sharewifi.model.viewmodel.WiFiNetwork.ShareStatus.SHARED_BY_ME_WITH_EVERYONE;
        case 1 :
            return com.tbaehr.sharewifi.model.viewmodel.WiFiNetwork.ShareStatus.SHARED_BY_ME_WITHIN_GROUPS;
        case 2 :
            return com.tbaehr.sharewifi.model.viewmodel.WiFiNetwork.ShareStatus.SHARED_BY_ME_WITH_MY_DEVICES;
        case 3 :
            return com.tbaehr.sharewifi.model.viewmodel.WiFiNetwork.ShareStatus.SHARED_WITH_ME_WITH_EVERYONE;
        case 4 :
            return com.tbaehr.sharewifi.model.viewmodel.WiFiNetwork.ShareStatus.SHARED_WITH_ME_WITHIN_GROUPS;
        case 5 :
            return com.tbaehr.sharewifi.model.viewmodel.WiFiNetwork.ShareStatus.NOT_SHARED;
        case 6 :
            return com.tbaehr.sharewifi.model.viewmodel.WiFiNetwork.ShareStatus.UNKNOWN;
        default :
            throw new java.lang.IllegalArgumentException((("Integer " + integer) + " is not a valid share status ID."));
    }
}