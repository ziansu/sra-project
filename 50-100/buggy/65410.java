public long insertItem(demo.kolorob.kolorobdemoversion.model.Health.HealthNewDBModelHospital hospital) {
    if (!(isFieldExist(hospital.getHealthId()))) {
        return insertItem(hospital.getId(), hospital.getHealthId(), hospital.getEmergencyavailable(), hospital.getEmergencynumber(), hospital.getAmbulanceavailable(), hospital.getAmbulancenumber(), hospital.getMaternityavailable(), hospital.getMaternitynumber(), hospital.getMaternityprivacy());
    }else
        return updateItem(hospital);
    
}