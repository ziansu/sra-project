private static java.util.List<org.verapdf.cos.COSObject> getListOfNames(org.verapdf.cos.COSObject object) {
    if ((object.getType()) == (org.verapdf.cos.COSObjType.COS_ARRAY)) {
        java.util.List<org.verapdf.cos.COSObject> names = new java.util.ArrayList<>();
        for (int i = 0; i < (object.size()); ++i) {
            names.add(object.at(i));
        }
        return names;
    }
    return null;
}