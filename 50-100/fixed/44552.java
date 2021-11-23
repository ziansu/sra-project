public void moveAppointment(org.rapla.entities.domain.AppointmentBlock appointmentBlock, java.util.Date newStart, org.rapla.gui.PopupContext context, boolean keepTime) throws org.rapla.framework.RaplaException {
    java.util.Date from = new java.util.Date(appointmentBlock.getStart());
    if (newStart.equals(from))
        return ;
    
    getLogger().info(((((("Moving appointment " + (appointmentBlock.getAppointment())) + " from ") + from) + " to ") + newStart));
    resizeAppointment(appointmentBlock, newStart, null, context, keepTime);
}