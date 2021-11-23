private java.lang.Byte convertNodeAnswer() {
    byte liveWith;
    switch (nodeAnswer.toUpperCase()) {
        case "YES" :
            liveWith = 1;
            break;
        default :
            liveWith = 0;
            break;
    }
    return liveWith;
}