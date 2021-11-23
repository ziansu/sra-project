public void deactivate(tom.lightwaverf.model.ItemState item) {
    if ((item instanceof tom.lightwaverf.model.ScheduledItem) && ((((tom.lightwaverf.model.ScheduledItem) (item)).getEndTime()) == null)) {
        return ;
    }
    unit.sendCommand(generateDeactivateCommand(item));
    item.setActivated(false);
}