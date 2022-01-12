private static void selectRandomInstrument(com.romanmarkunas.bandshuffle.BandMember bm) {
    java.util.List<com.romanmarkunas.bandshuffle.Instrument> instruments = bm.getInstruments();
    java.util.Random randomizer = new java.util.Random();
    int selected = randomizer.nextInt(instruments.size());
    bm.selectInstrument(instruments.get(selected));
}