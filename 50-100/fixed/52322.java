@java.lang.Override
public hr.karlovrbic.notify.v1.model.json.MessageJson get(java.lang.Long id) {
    hr.karlovrbic.notify.v1.model.entity.Message message = hr.karlovrbic.notify.v1.dao.manager.JPAEMProvider.getEntityManager().find(hr.karlovrbic.notify.v1.model.entity.Message.class, id);
    hr.karlovrbic.notify.v1.model.json.MessageJson messageJson = null;
    if (message != null) {
        messageJson = message.toJson();
    }
    hr.karlovrbic.notify.v1.dao.manager.JPAEMProvider.close();
    return messageJson;
}