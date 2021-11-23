public int getTotalReadySize() {
    synchronized(_dataLock) {
        if (_locallyClosed)
            return 0;
        
        int numBytes = 0;
        for (int i = 0; i < (_readyDataBlocks.size()); i++) {
            net.i2p.data.ByteArray cur = _readyDataBlocks.get(i);
            numBytes += cur.getValid();
            if (i == 0)
                numBytes -= _readyDataBlockIndex;
            
        }
        return numBytes;
    }
}