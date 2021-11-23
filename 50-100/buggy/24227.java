private com.fasterxml.jackson.databind.deser.SettableBeanProperty _findFromSpill(java.lang.String key) {
    int hashSize = (_hashMask) + 1;
    int i = hashSize + (hashSize >> 1);
    for (int end = i + (_spillCount); i < end; ++i) {
        if (key.equals(_keys[i])) {
            return _propsHash[1];
        }
    }
    return null;
}