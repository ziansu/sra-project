public void bindMovieData() {
    if ((movieData) != null) {
        tvTitle.setText(movieData.getTitle());
        tvOverview.setText(movieData.getOverview());
        com.squareup.picasso.Picasso.with(getActivity()).load(movieData.getImgUrl()).into(imageView);
    }
}