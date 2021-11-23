private void parseCleanup() {
    assert !(_pds._job.isStopped());
    water.parser.Futures fs = new water.parser.Futures();
    water.parser.ParseDataset.MultiFileParseTask mfpt = _pds._mfpt;
    _pds._mfpt = null;
    if (mfpt != null)
        mfpt.onExceptionCleanup(fs);
    
    for (water.parser.Key k : _keys)
        water.parser.Keyed.remove(k, fs);
    
    water.parser.Keyed.remove(_pds._job._result, fs);
    fs.blockForPending();
}