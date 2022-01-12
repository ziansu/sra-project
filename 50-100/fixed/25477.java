public void activate(tom.lightwaverf.model.ItemState item) {
    item.setActivated(true);
    if ((item instanceof tom.lightwaverf.model.ScheduledItem) && ((((tom.lightwaverf.model.ScheduledItem) (item)).getStartTime()) == null)) {
        return ;
    }
    unit.sendCommand(generateActivationCommand(item));
}