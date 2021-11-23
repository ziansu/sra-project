public java.lang.String forDisplay() {
    switch (value) {
        case "0" :
            return "Priority:\t\tNone";
        case "1" :
            return "Priority:\t\tLow";
        case "2" :
            return "Priority:\t\tMedium";
        case "3" :
            return "Priority:\t\tHigh";
        default :
            return "";
    }
}