protected int blinkCount() {
    switch (this) {
        case THREAT :
            return 0;
        case NOTIFY :
            return 3;
        case SELECT :
            return 0;
        case FLASHTHREAT :
            return 3;
        default :
            return 0;
    }
}