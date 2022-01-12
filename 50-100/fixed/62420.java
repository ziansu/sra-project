@java.lang.Override
public java.util.Collection<org.psem2m.utilities.rsrc.CXRsrcProvider> getRsrcProvider(final java.lang.String aTag) {
    java.util.List<org.psem2m.utilities.rsrc.CXRsrcProvider> wList = new java.util.ArrayList<org.psem2m.utilities.rsrc.CXRsrcProvider>();
    if ((pListProviderByTag.get(aTag)) != null) {
        wList.addAll(pListProviderByTag.get(aTag).values());
    }
    wList.add(getRsrcProviderMemory(aTag));
    return wList;
}