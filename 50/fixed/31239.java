@java.lang.Override
public void stop() throws java.lang.Exception {
    view.AutoClassMgr.doAllAutoClose();
    propertyWrapper.savePropertyBeanToJson();
    super.stop();
}