public void verifyWrittenTokenSet(me.scai.plato.engine.HandwritingEngine hwEng, java.lang.String[] trueTokenNames) {
    me.scai.plato.engine.CWrittenTokenSet wtSet = hwEng.getWrittenTokenSet();
    final int tnt = trueTokenNames.length;
    assertEquals(tnt, wtSet.getNumTokens());
    for (int i = 0; i < tnt; ++i) {
        assertEquals(trueTokenNames[i], wtSet.tokens.get(i).getRecogResult());
    }
}