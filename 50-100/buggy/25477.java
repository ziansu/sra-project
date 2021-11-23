public void activate(tom.lightwaverf.model.ItemState item) {
    if ((item instanceof tom.lightwaverf.model.ScheduledItem) && ((((tom.lightwaverf.model.ScheduledItem) (item)).getStartTime()) == null)) {
        return ;
    }
    unit.sendCommand(generateActivationCommand(item));
    item.setActivated(true);
}