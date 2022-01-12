@java.lang.Override
protected org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter createRecordRegisterAdapter() {
    java.util.List<org.unicef.rapidreg.forms.Field> fields = tracingRegisterPresenter.getValidFields();
    addProfileFieldForDetailsPage(1, fields);
    org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter recordRegisterAdapter = new org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter(getActivity(), fields, tracingRegisterPresenter.getDefaultItemValues(), true);
    tracingPhotoAdapter.setItems(tracingRegisterPresenter.getDefaultPhotoPaths());
    recordRegisterAdapter.setPhotoAdapter(tracingPhotoAdapter);
    return recordRegisterAdapter;
}