private KLVPacket.Header getPrimerPackHeader() throws java.io.IOException {
    return this.getHeaderPartition().getPrimerPack().getHeader();
}