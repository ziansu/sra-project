@java.lang.Override
public void getJokesWithChangedName(boolean isFilterNeeded, java.lang.String fullName) {
    if (!(fullName.equals(Constants.EMPTY_STRING))) {
        nameChangeView.showProgressRing(View.VISIBLE);
        com.marton.tamas.funnychuck.api.model.Name name = getName(fullName);
        if (isFilterNeeded) {
            nameChangeInteractor.getJokeWithChangedNameAndFilter(name);
        }else {
            nameChangeInteractor.getJokeWithChangedName(name);
        }
    }
}