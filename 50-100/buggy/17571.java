private java.lang.String getMessageShare() {
    if ((fragmentItemTask.getGenreList().get(0).getId()) == 99) {
        return getString(R.string.message_share_documental);
    }
    switch (getMediaType()) {
        case Common.TMDB_CODE_MOVIES :
            return getString(R.string.message_share_movie);
        case Common.TMDB_CODE_SERIES :
            return getString(R.string.message_share_tv);
    }
    return null;
}