public java.util.List<model.ContactInfo> findContactInfoListByUserId(java.lang.Integer patientId) {
    em.getTransaction().begin();
    model.Patient p = new model.Patient();
    p = em.find(model.Patient.class, patientId);
    p.getContactInfoList().size();
    java.util.List<model.ContactInfo> contactInfoList = p.getContactInfoList();
    java.lang.System.out.println("========================================");
    java.lang.System.out.println(contactInfoList);
    em.getTransaction().commit();
    return contactInfoList;
}