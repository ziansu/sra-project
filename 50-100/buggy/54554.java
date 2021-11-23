@java.lang.Override
protected org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter createRecordRegisterAdapter() {
    org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter recordRegisterAdapter = new org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter(getActivity(), caseRegisterPresenter.getValidFields(com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem.getPosition(getArguments())), new org.unicef.rapidreg.service.cache.ItemValuesMap(), false);
    recordRegisterAdapter.setItemValues(caseRegisterPresenter.getDefaultItemValues());
    org.unicef.rapidreg.base.record.recordphoto.RecordPhotoAdapter recordPhotoAdapter = new org.unicef.rapidreg.childcase.casephoto.CasePhotoAdapter(getActivity(), caseRegisterPresenter.getDefaultPhotoPaths());
    recordRegisterAdapter.setPhotoAdapter(recordPhotoAdapter);
    return recordRegisterAdapter;
}