protected org.verapdf.pd.font.COSStream getStreamFromObject(org.verapdf.pd.font.COSObject obj) throws java.io.IOException {
    if ((obj == null) || ((obj.getDirectBase().getType()) != (COSObjType.COS_STREAM))) {
        throw new java.io.IOException("Can't get COSStream from COSObject");
    }else {
        return ((org.verapdf.pd.font.COSStream) (obj.get()));
    }
}