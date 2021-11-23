private void _pushSentence(net.sf.marineapi.nmea.sentence.Sentence s, com.aboni.nmea.router.agent.NMEAAgent source) {
    if ((isStarted()) && (((_getTargetFilter()) == null) || (_getTargetFilter().match(s, source.getName())))) {
        doWithSentence(s, source);
    }
}