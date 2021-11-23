@java.lang.Override
public java.lang.String saveJobByUserModel(com.xanadutec.coreflex.model.UserModel usermodel, com.xanadutec.coreflex.model.Job job) {
    try {
        org.hibernate.Session session = sessionFactory.openSession();
        com.xanadutec.coreflex.model.SavedJob saveJob = new com.xanadutec.coreflex.model.SavedJob();
        saveJob.setJob(job);
        saveJob.setSavedIdDate(new java.util.Date());
        saveJob.setUserModel(usermodel);
        session.saveOrUpdate(saveJob);
        session.close();
        return "success";
    } catch (java.lang.Exception e) {
    }
    return null;
}