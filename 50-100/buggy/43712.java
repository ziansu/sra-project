@java.lang.Override
public void success(com.phrase.bit.api.models.PhraseRootModel phraseRootModel, retrofit.client.Response response) {
    com.phrase.bit.ui.viewmodels.PhraseViewModel model = new com.phrase.bit.ui.viewmodels.PhraseViewModel();
    model.setKey(phraseRootModel.getModel().getKey());
    model.setPhrase(phraseRootModel.getModel().getValue());
    phraseItems.add(model);
    phraseViewModelList.addAll(phraseItems);
    phraseAdapter.notifyDataSetChanged();
}