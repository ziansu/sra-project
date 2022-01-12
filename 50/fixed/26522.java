@java.lang.Override
public int compare(gov.loc.repository.bagit.BagFile bagFile1, gov.loc.repository.bagit.BagFile bagFile2) {
    return java.lang.Long.compare(bagFile2.getSize(), bagFile1.getSize());
}