@java.lang.Override
public rx.Observable<java.util.List<saulmm.avengers.entities.MarvelCharacter>> execute() {
    return mRepository.getCharacters(currentOffset).observeOn(mResultsThread).subscribeOn(mExecutorThread);
}