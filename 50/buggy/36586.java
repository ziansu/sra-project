public java.lang.String getDiagnosis() {
    java.lang.String res = "";
    int index = patHistoryList.getSelectedIndex();
    java.util.ArrayList<alertLife.Diagnosis> listOfDiagnoses = currentPatient.getDiagnoses();
    res = listOfDiagnoses.get(index).toString();
    return res;
}