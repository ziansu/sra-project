@java.lang.Override
public boolean onEntryCreated(java.lang.String vcard) {
    cn.edu.tsinghua.hpc.tcontacts.pim.VCardDataBuilder builder;
    try {
        builder = new cn.edu.tsinghua.hpc.tcontacts.pim.VCardDataBuilder("UTF-8", "UTF-8", false, cn.edu.tsinghua.hpc.tcontacts.pim.VCardConfig.VCARD_TYPE_V21_GENERIC, null);
        cn.edu.tsinghua.hpc.vcard.VCardParser p = new cn.edu.tsinghua.hpc.vcard.VCardParser_V21();
        p.parse(new java.io.ByteArrayInputStream(vcard.getBytes()), "UTF-8", builder);
        cn.edu.tsinghua.hpc.tcontacts.pim.ContactStruct contact = builder.mLastContactStruct;
        contact.pushIntoContentResolver(getContentResolver());
    } catch (java.lang.Exception e) {
        android.util.Log.d(cn.edu.tsinghua.hpc.tcontacts.ImportContactsFromSystemActivity.LOG_TAG, e.getMessage());
    }
    return true;
}