@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String text = s.toString().trim();
    savedApis.clear();
    org.buildmlearn.toolkit.model.SavedApi tempApi;
    for (int i = 0; i < (allsavedApis.size()); i++) {
        if (allsavedApis.get(i).getName().contains(text)) {
            savedApis.add(allsavedApis.get(i));
        }
    }
    mAdapter.notifyDataSetChanged();
    setEmptyText();
}