private void readExternal(com.tangosol.io.pof.PofReader pofReader) throws java.io.IOException {
    if ((pofReader.getVersionId()) >= 1) {
        this.media = ((serializers.coherence.media.Media) (pofReader.readObject(0)));
        this.images = ((java.util.List<serializers.coherence.media.Image>) (pofReader.readCollection(1, null)));
    }
}