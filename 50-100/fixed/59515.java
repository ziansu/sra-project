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
        case "not_scanned" :
        default :
            malicious = false;
            scanned = false;
            break;
    }
}