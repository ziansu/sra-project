private void getSpecialitiesDone(android.os.Bundle data) {
    com.extenprise.mapp.medico.util.Utility.showProgressDialog(this, false);
    mSpecialityList = data.getStringArrayList("specialities");
    if ((mSpecialityList) == null) {
        mSpecialityList = new java.util.ArrayList<>();
    }
    mSpecialityList.add(0, getString(R.string.select_speciality));
    if (!(mSpecialityList.contains(getString(R.string.other)))) {
        mSpecialityList.add(getString(R.string.other));
    }
}