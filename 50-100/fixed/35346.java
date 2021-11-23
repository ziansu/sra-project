private void editItem(ru.napadovskiu.tracker.Item editItem) {
    ru.napadovskiu.tracker.Item newEditItem = new ru.napadovskiu.tracker.Item(this.input.ask("please enter the name of item"), this.input.ask("please enter the description of item"));
    if (editItem != null) {
        newEditItem.setId(editItem.getId());
        this.tracker.editItem(newEditItem);
        this.showItem(editItem);
    }
}