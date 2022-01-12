private void setInfo(com.alvardev.listento.models.Song song) {
    java.lang.String urlCover = song.getUrlCover();
    if ((urlCover != null) && (!(urlCover.isEmpty()))) {
        com.squareup.picasso.Picasso.with(this).load(urlCover).placeholder(R.drawable.lp_logo).error(R.drawable.lp_logo).into(iviImageSound);
    }
}