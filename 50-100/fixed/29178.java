private void configureRetry(com.google.android.exoplayer2.source.ExtractorMediaPeriod.ExtractingLoadable loadable) {
    if (((length) != (com.google.android.exoplayer2.C.LENGTH_UNSET)) || (((seekMap) != null) && ((seekMap.getDurationUs()) != (com.google.android.exoplayer2.C.TIME_UNSET)))) {
    }else {
        loadable.setLoadPosition(0, 0);
    }
}