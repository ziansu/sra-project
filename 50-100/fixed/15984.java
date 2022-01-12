@java.lang.Override
public void incomingObject(org.openmainframe.ade.data.IAnalyzedInterval analyzedInterval) throws org.openmainframe.ade.exceptions.AdeException, org.openmainframe.ade.exceptions.AdeFlowException {
    for (org.openmainframe.ade.data.IAnalyzedMessageSummary ms : analyzedInterval.getAnalyzedMessages()) {
        final java.lang.String messageId = ms.getMessageId();
        final java.lang.Long[] delta = extractDelta(ms);
        org.openmainframe.ade.scores.LastSeenScorer.PerodicityBounder perodicityBounder = m_lastSeen.get(messageId);
        if (perodicityBounder == null) {
            perodicityBounder = new org.openmainframe.ade.scores.LastSeenScorer.PerodicityBounder();
            m_lastSeen.put(messageId, perodicityBounder);
        }
        perodicityBounder.addPoints(delta);
    }
}