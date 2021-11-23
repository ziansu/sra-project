@java.lang.Override
protected org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter createRecordRegisterAdapter() {
    org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter recordRegisterAdapter = new org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter(getActivity(), caseRegisterPresenter.getValidFields(), new org.unicef.rapidreg.service.cache.ItemValuesMap(), true);
    recordRegisterAdapter.setItemValues(caseRegisterPresenter.getDefaultItemValues());
    org.unicef.rapidreg.base.record.recordphoto.RecordPhotoAdapter recordPhotoAdapter = new org.unicef.rapidreg.childcase.casephoto.CasePhotoAdapter(getActivity(), caseRegisterPresenter.getDefaultPhotoPaths());
    recordRegisterAdapter.setPhotoAdapter(recordPhotoAdapter);
    return recordRegisterAdapter;
}