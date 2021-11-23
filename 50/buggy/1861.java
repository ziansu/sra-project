private void reformData() {
    android.os.Bundle bundle = getArguments();
    java.lang.System.out.println("Called reform data");
    if (bundle != null) {
        java.lang.System.out.println("get data");
        specialitySelected = bundle.getBooleanArray(PatientViewActivity.PATIENT);
    }else {
        specialitySelected = null;
    }
}