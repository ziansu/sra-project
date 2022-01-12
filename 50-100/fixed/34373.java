private void checkArrayListForDuplicates(java.util.List<esendex.sdk.java.model.domain.impl.MetaData> metaData) throws esendex.sdk.java.EsendexException {
    java.util.ArrayList<java.lang.String> alreadyKeys = new java.util.ArrayList<java.lang.String>();
    for (java.util.Iterator<esendex.sdk.java.model.domain.impl.MetaData> i = metaData.iterator(); i.hasNext();) {
        esendex.sdk.java.model.domain.impl.MetaData item = i.next();
        for (java.lang.String string : alreadyKeys) {
            if (string == (item.getName()))
                throw new esendex.sdk.java.EsendexException("MetaData fields collection cannot contain duplicate fields");
            
            alreadyKeys.add(item.getName());
        }
    }
}