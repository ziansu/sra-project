public void setArrayKey(final org.verapdf.as.ASAtom key, final org.verapdf.cos.COSObject array) {
    if (((this.base) == null) || (!(this.base.setArrayKey(key, array)))) {
        org.verapdf.cos.COSObject obj = org.verapdf.cos.COSArray.construct();
        this.base = new org.verapdf.cos.COSDictionary(key, obj);
    }
}