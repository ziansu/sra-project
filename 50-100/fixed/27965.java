@butterknife.OnClick(value = R.id.button_update)
void onUpdateButtonClicked() {
    java.util.List<co.infinum.testapp.models.Item> newList = new java.util.ArrayList<>();
    newList.add(new co.infinum.testapp.models.Item(1, "Car"));
    newList.add(new co.infinum.testapp.models.Item(2, "Plane"));
    newList.add(new co.infinum.testapp.models.Item(3, java.util.UUID.randomUUID().toString()));
    adapter.update(newList, new co.infinum.testapp.diffutils.ItemsDiffUtil(items, newList));
}