@java.lang.Override
public void handle(io.reactivesw.cart.domain.model.Cart entity, io.reactivesw.cart.infrastructure.update.UpdateAction action) {
    io.reactivesw.model.Updater updater = getUpdateService(action);
    updater.handle(entity, action);
}