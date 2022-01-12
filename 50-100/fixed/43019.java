@java.lang.Override
protected org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter createRecordRegisterAdapter() {
    org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter recordRegisterAdapter = new org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter(getActivity(), caseRegisterPresenter.getValidFields(), caseRegisterPresenter.getDefaultItemValues(), true);
    org.unicef.rapidreg.base.record.recordphoto.RecordPhotoAdapter recordPhotoAdapter = new org.unicef.rapidreg.childcase.casephoto.CasePhotoAdapter(getActivity(), caseRegisterPresenter.getDefaultPhotoPaths());
    recordRegisterAdapter.setPhotoAdapter(recordPhotoAdapter);
    return recordRegisterAdapter;
}