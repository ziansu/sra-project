protected void setInput(final MWC.TacticalData.IRollingNarrativeProvider newNarr) {
    if (newNarr != (_myRollingNarrative)) {
        if ((_myRollingNarrative) != null) {
            myViewer.setInput(null);
            _myRollingNarrative.removeNarrativeListener(IRollingNarrativeProvider.ALL_CATS, _myRollingNarrListener);
        }
        _myRollingNarrative = newNarr;
        _myRollingNarrative.addNarrativeListener(IRollingNarrativeProvider.ALL_CATS, _myRollingNarrListener);
        myViewer.setInput(_myRollingNarrative);
    }
}