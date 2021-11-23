private org.crosswire.jsword.book.sword.DataEntry getEntry(org.crosswire.jsword.book.sword.state.RawLDBackendState state, java.lang.String reply, int index) throws java.io.IOException {
    org.crosswire.jsword.book.sword.DataIndex dataIndex = getIndex(state, index);
    byte[] data = org.crosswire.jsword.book.sword.SwordUtil.readRAF(state.getDatRaf(), dataIndex.getOffset(), dataIndex.getSize());
    return new org.crosswire.jsword.book.sword.DataEntry(reply, data, org.crosswire.jsword.book.sword.RawLDBackend.getBookMetaData().getBookCharset());
}