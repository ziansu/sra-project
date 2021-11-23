@java.lang.Override
public void onAppointmentDelete(int position_p) {
    _currentWorker.removeStoreAppointment(_currentWorker.getStoreAppointment(position_p));
    notifyDataSetChanged();
}