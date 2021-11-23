public boolean hasWeight(java.lang.String target) {
    for (int i = 0; i < (this._length); i++)
        if (((com.browseengine.bobo.facets.data.TermStringList) (_mTermList)).get(_buf[i]).equals(target)) {
            _weight[0] = weightBuf[i];
            return true;
        }
    
    return false;
}