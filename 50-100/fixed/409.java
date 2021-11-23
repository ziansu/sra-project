@java.lang.Override
public void onBindViewHolder(movies.popular.jd.com.udacitypopularmovies.MovieCursorRecyclerAdapter.MovieItemViewHolder holder, int position) {
    if (!(mDataValid))
        throw new java.lang.IllegalStateException("Cannot bind invalid data to view ");
    
    if (!(mCursor.moveToPosition(position))) {
        throw new java.lang.IllegalStateException(("Could not move cursor to the specifed position: " + position));
    }
    onBindViewHolder(holder, mCursor, position);
}