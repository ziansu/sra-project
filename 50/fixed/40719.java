private java.lang.Object[] getReturnPatientsParams() {
    return new java.lang.Object[]{ 1 , getAdminSession() , getAllPatientIds() , new java.lang.String[]{ "rec_name" , "age" , "diseases" , "sex" , "primary_care_doctor.name" , "primary_care_doctor.rec_name" } , "REPLACE_CONTEXT" };
}