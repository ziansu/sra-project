@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String text = s.toString().trim();
    savedApis.clear();
    for (int i = 0; i < (allsavedApis.size()); i++) {
        if (allsavedApis.get(i).getName().toLowerCase().contains(text.toLowerCase())) {
            savedApis.add(allsavedApis.get(i));
        }
    }
    mAdapter.notifyDataSetChanged();
    setEmptyText();
}