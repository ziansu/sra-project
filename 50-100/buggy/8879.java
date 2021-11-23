public void setValue(fd2editor.BaseSeg.VALUE whichValue, int sValue) {
    sValue = sValue & 134217727;
    if (sValue > (max)) {
        sValue = max;
    }
    if (sValue < (min)) {
        sValue = min;
    }
    switch (whichValue) {
        case DEFAULT :
            this.defaultValue = sValue;
            break;
        case RECOMMEND :
            this.recommendValue = sValue;
            break;
        case CURRENT :
            this.value = sValue;
            updateSegBytes();
            break;
        default :
            break;
    }
}