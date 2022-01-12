private org.crosswire.jsword.book.sword.DataEntry getEntry(org.crosswire.jsword.book.sword.state.RawLDBackendState state, java.lang.String reply, org.crosswire.jsword.book.sword.DataIndex dataIndex) throws java.io.IOException {
    byte[] data = org.crosswire.jsword.book.sword.SwordUtil.readRAF(state.getDatRaf(), dataIndex.getOffset(), dataIndex.getSize());
    return new org.crosswire.jsword.book.sword.DataEntry(reply, data, org.crosswire.jsword.book.sword.RawLDBackend.getBookMetaData().getBookCharset());
}