public void setCarpet(me.libraryaddict.disguise.disguisetypes.AnimalColor color) {
    setData(FlagType.LLAMA_CARPET, color.getId());
    sendData(FlagType.LLAMA_CARPET);
}