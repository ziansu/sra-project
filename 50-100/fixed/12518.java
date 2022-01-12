@java.lang.Override
public byte[] getBinaryContentById(int id, int publication) throws org.dd4t.core.exceptions.ItemNotFoundException {
    final com.tridion.data.BinaryData binaryData = org.dd4t.providers.impl.BrokerBinaryProvider.BINARY_CONTENT_RETRIEVER.getBinary(publication, id);
    if ((binaryData == null) || ((binaryData.getDataSize()) == 0)) {
        throw new org.dd4t.core.exceptions.ItemNotFoundException(((("Unable to find binary content by id: tcm:" + publication) + "-") + id));
    }
    try {
        return binaryData.getBytes().clone();
    } catch (java.io.IOException e) {
        throw new org.dd4t.core.exceptions.ItemNotFoundException(e);
    }
}