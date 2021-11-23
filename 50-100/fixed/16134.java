@java.lang.Override
protected void publishResults(java.lang.CharSequence charSequence, com.rescribe.adapters.book_appointment.FilterResults filterResults) {
    mDataList = ((java.util.ArrayList<com.rescribe.model.book_appointment.doctor_data.DoctorList>) (filterResults.values));
    if ((mDataList.size()) == 0) {
        com.rescribe.ui.fragments.book_appointment.RecentVisitDoctorFragment temp = ((com.rescribe.ui.fragments.book_appointment.RecentVisitDoctorFragment) (mFragment));
        temp.isDataListViewVisible(true, true);
    }else {
        com.rescribe.ui.fragments.book_appointment.RecentVisitDoctorFragment temp = ((com.rescribe.ui.fragments.book_appointment.RecentVisitDoctorFragment) (mFragment));
        temp.isDataListViewVisible(true, false);
    }
    notifyDataSetChanged();
}