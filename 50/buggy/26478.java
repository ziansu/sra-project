@java.lang.Override
public void onSuccess(java.lang.Void result) {
    org.ednovo.gooru.application.shared.model.code.CodeDo deletedObj = new org.ednovo.gooru.application.shared.model.code.CodeDo();
    deletedObj.setCodeId(codeObj.getCodeId());
    deletedStandardsDo.add(deletedObj);
    centurySelectedValues.remove(java.lang.Long.parseLong(id));
}