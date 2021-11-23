@java.lang.Override
public void onClick(android.view.View v) {
    us.ridiculousbakery.espressoexpress.Model.SelectedOption opToDelete = ((us.ridiculousbakery.espressoexpress.Model.SelectedOption) (v.getTag()));
    chosenOptions.remove(opToDelete);
    aOptions.addOption(opToDelete.getCategory(), item.getOptions().get(opToDelete.getCategory()));
    setButtonVisability();
    syncViewWithChosenOptions();
}