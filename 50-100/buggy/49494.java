@java.lang.Override
public void getJokesWithChangedName(boolean isFilterNeeded, java.lang.String fullName) {
    nameChangeView.showProgressRing(View.VISIBLE);
    com.marton.tamas.funnychuck.api.model.Name name = getName(fullName);
    if (!(fullName.equals(Constants.EMPTY_STRING))) {
        if (isFilterNeeded) {
            nameChangeInteractor.getJokeWithChangedNameAndFilter(name);
        }else {
            nameChangeInteractor.getJokeWithChangedName(name);
        }
    }
}