private void checkTime() {
    if (!(isValidTime())) {
        m_time.setErrorMessageWidth((((m_popup.getOffsetWidth()) - 32) + (Unit.PX.toString())));
        m_time.setErrorMessage(org.opencms.gwt.client.Messages.get().key(Messages.ERR_DATEBOX_INVALID_TIME_FORMAT_0));
    }else {
        m_time.setErrorMessage(null);
    }
    updateCloseBehavior();
}