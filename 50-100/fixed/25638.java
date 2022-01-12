@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    newText = newText.toLowerCase();
    java.util.List<com.example.kimjaeseung.cultureseoul2.domain.CultureEvent> newList = new java.util.ArrayList<>();
    for (com.example.kimjaeseung.cultureseoul2.domain.CultureEvent cultureEvent : mCultureEventLIst) {
        java.lang.String name = cultureEvent.getTitle().toLowerCase();
        if (name.contains(newText))
            newList.add(cultureEvent);
        
    }
    mAdapter.setFilter(newList);
    return true;
}