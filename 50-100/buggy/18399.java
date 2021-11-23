public cc.creativecomputing.io.data.CCDataObject presetData() {
    cc.creativecomputing.io.data.CCDataObject myData = new cc.creativecomputing.io.data.CCDataObject();
    for (java.lang.String myKey : _myChildHandles.keySet()) {
        cc.creativecomputing.control.handles.CCPropertyHandle myHandle = _myChildHandles.get(myKey);
        myData.put(myHandle.memberName(), myHandle.data());
    }
    cc.creativecomputing.io.data.CCDataObject myResult = new cc.creativecomputing.io.data.CCDataObject();
    cc.creativecomputing.core.logging.CCLog.info(name());
    myResult.put("value", myData);
    return myResult;
}