@org.junit.Test
public void testEmpty() {
    org.grouplens.lenskit.data.dao.packed.BinaryIndexTable tbl = org.grouplens.lenskit.data.dao.packed.BinaryIndexTable.fromBuffer(0, java.nio.ByteBuffer.allocate(0));
    org.junit.Assert.assertThat(tbl.getKeys(), hasSize(0));
    org.junit.Assert.assertThat(tbl.getEntry(42), nullValue());
}