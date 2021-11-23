@java.lang.Override
public jonasandtim.energietagebuch.Data.DataInterfaces.KBRDataHasChangedMessage update(jonasandtim.energietagebuch.Data.DataElements.XDataElement oldElement, jonasandtim.energietagebuch.Data.DataElements.XDataElement newElement) {
    jonasandtim.energietagebuch.Data.DataInterfaces.KBRDataHasChangedMessage msg = null;
    if (validateEntry(newElement)) {
        msg = mDataTree.updateElementGetMessage(oldElement, newElement);
        if (msg != null)
            msg.putProperty(KBRDataHasChangedMessage.PROPERTIES_METERID, mMeter.getUId());
        
    }
    return msg;
}