@java.lang.Override
public void success(id.co.veritrans.sdk.coreflow.models.AuthModel authModel, retrofit.client.Response response) {
    id.co.veritrans.sdk.coreflow.core.TransactionManager.releaseResources();
    id.co.veritrans.sdk.coreflow.eventbus.bus.VeritransBusProvider.getInstance().post(new id.co.veritrans.sdk.coreflow.eventbus.events.AuthenticationEvent(authModel));
}