public main.java.binBeats.lib.BinBeat loadBinBeat(java.lang.String bn) {
    int position = this.searchBeatName(bn);
    return beatList.get(position);
}