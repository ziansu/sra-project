public void setBlazing(boolean isBlazing) {
    setValue(FlagType.BLAZE_BLAZING, ((byte) (isBlazing ? 1 : 0)));
    sendData(FlagType.BLAZE_BLAZING);
}