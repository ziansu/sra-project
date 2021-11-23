@java.lang.Override
public cz.metacentrum.perun.notif.entities.PerunNotifReceiver updatePerunNotifReceiver(cz.metacentrum.perun.notif.entities.PerunNotifReceiver receiver) throws cz.metacentrum.perun.core.api.exceptions.InternalErrorException {
    this.getJdbcTemplate().update("update pn_receiver set target = ?, type_of_receiver = ?, template_id = ?, locale = ? where id = ?", receiver.getTarget(), receiver.getTypeOfReceiver().getKey(), receiver.getTemplateId(), receiver.getLocale(), receiver.getId());
    return getPerunNotifReceiverById(receiver.getId());
}