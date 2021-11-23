@java.lang.Override
public int compare(gov.loc.repository.bagit.BagFile bagFile1, gov.loc.repository.bagit.BagFile bagFile2) {
    return ((java.lang.Long) (bagFile2.getSize())).compareTo(bagFile1.getSize());
}