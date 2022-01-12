@java.lang.Override
public void onChecked(com.pokescanner.objects.FilterItem filterItem) {
    filterItems.set(((filterItem.getNumber()) - 1), filterItem);
}