@java.lang.Override
public void onChanged(dev.blunch.blunch.activity.EventType type) {
    java.util.List<dev.blunch.blunch.domain.CollaborativeMenu> list = collaborativeMenuService.getAll();
    collaborativeMenu = list.get(0);
    if ((collaborativeMenu.getLocalization()) == null)
        android.util.Log.d("el aliento de mi gato", collaborativeMenu.getId());
    else {
        suggestedDishes = collaborativeMenuService.getSuggestedDishes(collaborativeMenu.getId());
        offeredDishes = collaborativeMenuService.getOfferedDishes(collaborativeMenu.getId());
        initialize();
    }
}