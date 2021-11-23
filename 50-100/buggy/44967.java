private static <V> int findChildWithItem(com.flarestar.drones.views.viewgroups.dynamic.RangeViewFactory<V> viewFactory, com.flarestar.drones.views.viewgroups.BaseDroneViewGroup parent, V item, int index, int endChildIndex) {
    for (; index != endChildIndex; ++index) {
        com.flarestar.drones.views.scope.Scope<?> childScope = parent.getScope().getChildScopeFor(parent.getChildAt(index));
        if (childScope == null) {
            continue;
        }
        if (item == (viewFactory.getItem(childScope))) {
            return index;
        }
    }
    return -1;
}