public void deactivate(tom.lightwaverf.model.ItemState item) {
    item.setActivated(false);
    if ((item instanceof tom.lightwaverf.model.ScheduledItem) && ((((tom.lightwaverf.model.ScheduledItem) (item)).getEndTime()) == null)) {
        return ;
    }
    unit.sendCommand(generateDeactivateCommand(item));
}