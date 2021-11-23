public boolean handleEvent3(java.lang.String aNodeName, java.lang.String aNodeValue) {
    if (conditionFunction3(aNodeName))
        doReaction3(aNodeName, aNodeValue);
    else
        if ((mNext) != null)
            return mNext.handleEvent3(aNodeName, aNodeValue);
        
    
    return false;
}