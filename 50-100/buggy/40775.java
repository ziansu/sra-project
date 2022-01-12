public void bindSkillTest(java.lang.String fileName) {
    if ((edu.uci.ics.sdcl.firefly.storage.SkillTestSource.skillFileTable.get(fileName)) == null) {
        int extensionIndex = fileName.indexOf('.');
        if (extensionIndex != 1)
            fileName = ((java.lang.String) (fileName.subSequence(0, extensionIndex)));
        
        int index = (edu.uci.ics.sdcl.firefly.storage.SkillTestSource.skillFileTable.size()) % (edu.uci.ics.sdcl.firefly.storage.SkillTestSource.skillTests.size());
        edu.uci.ics.sdcl.firefly.storage.SkillTestSource.skillFileTable.put(fileName, edu.uci.ics.sdcl.firefly.storage.SkillTestSource.skillTests.get(index));
    }
}