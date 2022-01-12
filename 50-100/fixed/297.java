@java.lang.Override
public cc.creativecomputing.io.data.CCDataObject dataObject() {
    if ((_myPreset) != null) {
        cc.creativecomputing.io.data.CCDataObject myResult = new cc.creativecomputing.io.data.CCDataObject();
        myResult.put("preset", _myPreset);
        return myResult;
    }
    cc.creativecomputing.io.data.CCDataObject myData = new cc.creativecomputing.io.data.CCDataObject();
    for (java.lang.String myKey : _myChildHandles.keySet()) {
        cc.creativecomputing.control.handles.CCPropertyHandle myHandle = _myChildHandles.get(myKey);
        myData.put(myHandle.name(), myHandle.data());
    }
    return myData;
}