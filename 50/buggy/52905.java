public void setCarpet(me.libraryaddict.disguise.disguisetypes.AnimalColor color) {
    setData(FlagType.LLAMA_CARPET, color.ordinal());
    sendData(FlagType.LLAMA_CARPET);
}