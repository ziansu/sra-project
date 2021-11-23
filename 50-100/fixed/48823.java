@java.lang.Override
public void removePatientId(java.util.List<java.lang.String> patientIdList) {
    if ((patientIdList != null) && (!(patientIdList.isEmpty()))) {
        synchronized(patients) {
            for (int i = (patients.size()) - 1; i >= 0; i--) {
                if (!(patientIdList.contains(patients.get(i).getPatientID()))) {
                    patients.remove(i);
                }
            }
        }
    }
}