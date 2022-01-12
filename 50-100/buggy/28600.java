public boolean handleEvent(java.lang.String aName, java.lang.String aPath, org.xml.sax.Attributes attributes) {
    if (conditionFunction(aName, aPath))
        doReaction(aName, attributes);
    else
        if ((mNext) != null)
            return mNext.handleEvent(aName, aPath, attributes);
        
    
    return true;
}