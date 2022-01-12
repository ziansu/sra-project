@java.lang.Override
public cz.metacentrum.perun.notif.entities.PerunNotifReceiver createPerunNotifReceiver(cz.metacentrum.perun.notif.entities.PerunNotifReceiver receiver) throws cz.metacentrum.perun.core.api.exceptions.InternalErrorException {
    int newPerunNotifReceiverId = cz.metacentrum.perun.core.impl.Utils.getNewId(this.getJdbcTemplate(), "pn_receiver_id_seq");
    this.getJdbcTemplate().update("insert into pn_receiver (id, target, type_of_receiver, template_id, locale) values (?, ?, ?, ?, ?)", newPerunNotifReceiverId, receiver.getTarget(), receiver.getTypeOfReceiver().getKey(), receiver.getTemplateId(), receiver.getLocale().getLanguage());
    receiver.setId(newPerunNotifReceiverId);
    return receiver;
}