private void setBatchResults(com.dyomin.udatraining.popmovapp.data.poster.PosterBatch batch) {
    if ((posterAdapter) != null) {
        posterAdapter.updateResults(batch.getMovieDetailses());
    }else {
        posterAdapter = new com.dyomin.udatraining.popmovapp.data.poster.PosterAdapter(getActivity(), batch.getMovieDetailses());
        gv.setAdapter(posterAdapter);
    }
    updatePageNavigatorUI(batch);
    sendBootIntent(batch);
}