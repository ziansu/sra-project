public java.util.List<model.ContactInfo> findContactInfoListByUserId(java.lang.Integer patientId) {
    em.getTransaction().begin();
    model.Patient p = new model.Patient();
    p = em.find(model.Patient.class, patientId);
    p.getContactInfoList().size();
    java.util.List<model.ContactInfo> contactInfoList = p.getContactInfoList();
    em.getTransaction().commit();
    return contactInfoList;
}