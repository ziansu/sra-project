public void loadDoctors() {
    com.parse.ParseQuery<com.samahop.samahope.doctors.DoctorProfile> query = com.samahop.samahope.doctors.DoctorProfile.getQuery();
    query.fromLocalDatastore();
    query.findInBackground(new com.parse.FindCallback<com.samahop.samahope.doctors.DoctorProfile>() {
        @java.lang.Override
        public void done(java.util.List<com.samahop.samahope.doctors.DoctorProfile> l, com.parse.ParseException e) {
            if (e == null) {
                notifyDataSetChanged();
            }else {
                android.util.Log.e("DoctorProfileAdapter", ("Error while querying in background: " + (e.getMessage())));
            }
        }
    });
}