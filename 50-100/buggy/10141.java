public rx.Observable<java.util.List<saulmm.avengers.entities.MarvelCharacter>> executeIncreasingOffset() {
    currentOffset += saulmm.avengers.GetCharactersUsecase.CHARACTERS_LIMIT;
    return mRepository.getCharacters(currentOffset).observeOn(mExecutorThread).subscribeOn(mResultsThread).doOnError(new rx.functions.Action1<java.lang.Throwable>() {
        @java.lang.Override
        public void call(java.lang.Throwable throwable) {
            currentOffset -= saulmm.avengers.GetCharactersUsecase.CHARACTERS_LIMIT;
        }
    });
}