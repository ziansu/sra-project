@java.lang.Override
public java.lang.Boolean getcontainsOtherEntries() {
    java.util.Set<org.apache.pdfbox.cos.COSName> names = ((org.apache.pdfbox.cos.COSDictionary) (this.simplePDObject)).keySet();
    for (org.apache.pdfbox.cos.COSName name : names) {
        if (((name.compareTo(org.verapdf.model.impl.pb.pd.signatures.PBoxPDPerms.UC3)) != 0) && ((name.compareTo(COSName.DOC_MDP)) != 0)) {
            return true;
        }
    }
    return false;
}