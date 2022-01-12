public void setMaliciousFlag(java.lang.String flag) {
    switch (flag) {
        case "true" :
            malicious = true;
            scanned = true;
            break;
        case "false" :
            malicious = false;
            scanned = true;
            break;
        default :
        case "not_scanned" :
            malicious = false;
            scanned = false;
            break;
    }
}