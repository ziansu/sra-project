public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
    java.lang.String lNodeName = mCurrentPath.get(((mCurrentPath.size()) - 1));
    java.lang.String lNodeValue = new java.lang.String(ch, start, length).trim();
    if (((mCurrentTravelDataInput) != null) && (mValidSearchNodes.contains(lNodeName))) {
        mCurrentTravelDataInput.set(lNodeName, lNodeValue);
    }else {
        mConfigValues.put(getPath(), lNodeValue);
    }
}