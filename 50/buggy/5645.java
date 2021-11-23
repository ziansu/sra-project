@java.lang.Override
public int bytesCount() {
    return (((hashes.bytesCount()) + (pieces.bytesCount())) + (downloadedBlocks.size())) + (peers.size());
}