public java.lang.String getDiagnosis() {
    int index = patHistoryList.getSelectedIndex();
    java.util.ArrayList<alertLife.Diagnosis> listOfDiagnoses = currentPatient.getDiagnoses();
    return listOfDiagnoses.get(index).toString();
}