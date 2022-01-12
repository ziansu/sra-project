public boolean addBBData(java.lang.String type, com.seanModTest.templates.BuildBlockData bbd) {
    java.util.ArrayList<com.seanModTest.templates.BuildBlockData> bbdList = typeToBBData.get(type);
    if (bbdList == null) {
        bbdList = new java.util.ArrayList<com.seanModTest.templates.BuildBlockData>();
        typeToBBData.put(type, bbdList);
    }
    bbdList.add(bbd);
    return true;
}