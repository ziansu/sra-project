@java.lang.Override
public java.lang.Object deserialize(com.tangosol.io.pof.PofReader pofReader) throws java.io.IOException {
    data.media.MediaContent mediaContent = new data.media.MediaContent();
    mediaContent.media = ((data.media.Media) (pofReader.readObject(0)));
    mediaContent.images = ((java.util.List<data.media.Image>) (pofReader.readCollection(1, null)));
    return mediaContent;
}