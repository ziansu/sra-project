public boolean add(org.organet.commons.inofy.Model.SharedFileHeader sharedFileHeader) {
    sharedFileHeader.setNDNid(getNDNcount());
    return sharedFileHeaders.add(sharedFileHeader);
}