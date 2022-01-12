@java.lang.Override
protected org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter createRecordRegisterAdapter() {
    org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter recordRegisterAdapter = new org.unicef.rapidreg.base.record.recordregister.RecordRegisterAdapter(getActivity(), tracingRegisterPresenter.getValidFields(com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem.getPosition(getArguments())), tracingRegisterPresenter.getDefaultItemValues(), true);
    org.unicef.rapidreg.tracing.tracingphoto.TracingPhotoAdapter tracingPhotoAdapter = new org.unicef.rapidreg.tracing.tracingphoto.TracingPhotoAdapter(getActivity(), tracingRegisterPresenter.getDefaultPhotoPaths());
    recordRegisterAdapter.setPhotoAdapter(tracingPhotoAdapter);
    return recordRegisterAdapter;
}