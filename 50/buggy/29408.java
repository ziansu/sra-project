@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (!(newText.isEmpty()))
        searchObservable.onNext(newText);
    
    return true;
}