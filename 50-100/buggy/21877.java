@java.lang.Override
public void onClick(android.view.View view) {
    if (!(timeSlots.isTaken())) {
        holder.timeButton.setPressed(true);
        startActivity(new android.content.Intent(getActivity(), com.byteshaft.doctor.patients.CreateAppointmentActivity.class));
    }else {
        com.byteshaft.doctor.utils.Helpers.showSnackBar(getView(), R.string.time_slot_booked);
    }
}