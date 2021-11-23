@butterknife.OnClick(value = R.id.btnSubmit)
void onClickSubmit() {
    com.wondereight.airsensio.UtilClass.Global.GetInstance().SetStateSymptomList(symptomList);
    if (isSelectedSymptom(symptomList)) {
        com.wondereight.airsensio.UtilClass.SaveSharedPreferences.addSymptomData(this, getParam());
        android.content.Intent intent = new android.content.Intent();
        setResult(com.wondereight.airsensio.Activity.RESULT_OK, intent);
        finish();
    }else
        utilityClass.toast(getResources().getString(R.string.select_symptom));
    
}