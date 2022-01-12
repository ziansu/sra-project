@java.lang.Override
public void writeRecord(com.rtg.ngs.tempstage.BinaryTempFileRecord rec) throws java.io.IOException {
    mBuffer.clear();
    rec.writeNio(mBuffer);
    mBuffer.flip();
    mOutChannel.write(mBuffer);
}