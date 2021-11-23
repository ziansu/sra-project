public void editPatientProf(android.view.View v) {
    if (!(mEditTextCustomerFName.isEnabled())) {
        setFieldsEnability(true);
        if ((mAddrLayout.getVisibility()) != (android.view.View.VISIBLE)) {
            com.extenprise.mapp.medico.util.Utility.collapseExpand(mAddrLayout);
            com.extenprise.mapp.medico.util.Utility.collapseExpand(mContLay);
        }
    }else {
        setFieldsEnability(false);
    }
}