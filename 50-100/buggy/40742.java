@java.lang.Override
public void update(double delta) {
    super.update(delta);
    if ((currentState) == (se.chalmers.get_rect.game.entities.worldObjects.model.Computer.ARCH_INSTALL)) {
        (installTicks)++;
    }
    if ((installTicks) == (se.chalmers.get_rect.game.entities.worldObjects.model.Computer.ARCH_INSTALL_TIME)) {
        currentState = se.chalmers.get_rect.game.entities.worldObjects.model.Computer.ARCH;
        triggerEvent("computer", "installed arch");
    }
}