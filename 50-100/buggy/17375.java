public void setContent(final com.charlesmadere.hummingbird.models.LibraryEntry libraryEntry) {
    final com.charlesmadere.hummingbird.models.Rating rating = com.charlesmadere.hummingbird.models.Rating.from(libraryEntry);
    for (int position = 0; position < (getCount()); ++position) {
        final com.charlesmadere.hummingbird.models.Rating item = getItemAtPosition(position);
        if (rating == item) {
            setSelection(position);
            return ;
        }
    }
    throw new java.lang.RuntimeException((((("The given " + (com.charlesmadere.hummingbird.models.Rating.class.getSimpleName())) + " (") + rating) + ") doesn't exist in the list"));
}