@java.lang.Override
public void removeCartItem(java.lang.String item) {
    mView.onRemoveCartItemColor(false);
    com.lanthanh.admin.icareapp.domain.model.DTOAppointmentSchedule dtoAppointmentSchedule = getSpecificSchedule(item);
    if (dtoAppointmentSchedule != null) {
        com.lanthanh.admin.icareapp.domain.interactor.RemoveTemporaryBookingInteractor removeTemporaryBookingInteractor = new com.lanthanh.admin.icareapp.domain.interactor.impl.RemoveTemporaryBookingInteractorImpl(mExecutor, mMainThread, this, appointmentManager, appointment.getLocationId(), dtoAppointmentSchedule.getMachineId(), dtoAppointmentSchedule);
        removeTemporaryBookingInteractor.execute();
    }else
        onError("Item to be removed doesn't exist");
    
}