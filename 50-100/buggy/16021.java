private void sendItemContent() throws java.io.IOException {
    android.util.Log.d(net.nitroshare.android.transfer.Transfer.TAG, "writing item content");
    byte[] buffer = new byte[net.nitroshare.android.transfer.Transfer.CHUNK_SIZE];
    int numBytes = mCurrentItem.read(buffer);
    mSendingPacket = new net.nitroshare.android.transfer.Packet(Packet.BINARY, buffer, numBytes);
    mCurrentItemBytesRemaining -= numBytes;
    mTotalBytesTransferred += numBytes;
    updateProgress();
    if ((mCurrentItemBytesRemaining) <= 0) {
        mCurrentItem.close();
        mState = (mIterator.hasNext()) ? net.nitroshare.android.transfer.Transfer.State.ItemHeader : net.nitroshare.android.transfer.Transfer.State.Finished;
    }
}