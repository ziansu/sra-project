@java.lang.Override
public ru.kolaer.api.mvp.model.kolaerweb.NotifyMessage getLastNotifyMessage() throws ru.kolaer.api.exceptions.ServerException {
    return this.restTemplate.getForObject(this.URL_GET_LAST, ru.kolaer.api.mvp.model.kolaerweb.NotifyMessage.class);
}