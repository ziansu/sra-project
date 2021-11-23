public void setBlazing(boolean isBlazing) {
    setValue(FlagType.BLAZE_BLAZING, isBlazing);
    sendData(FlagType.BLAZE_BLAZING);
}