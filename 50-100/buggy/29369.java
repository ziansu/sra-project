@java.lang.Override
public void onChanged(dev.blunch.blunch.activity.EventType type) {
    if (type.equals(EventType.Full)) {
        collaborativeMenu = collaborativeMenuService.get(menuId);
        suggestedDishes = collaborativeMenuService.getSuggestedDishes(collaborativeMenu.getId());
        offeredDishes = collaborativeMenuService.getOfferedDishes(collaborativeMenu.getId());
        initialize();
    }
}