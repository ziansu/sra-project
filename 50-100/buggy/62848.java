private void filterSegmentList(@android.support.annotation.Nullable
java.util.List<ch.srg.mediaplayer.segment.model.Segment> segmentList) {
    segments.clear();
    if (segmentList != null) {
        for (ch.srg.mediaplayer.segment.model.Segment s : segmentList) {
            if (s.isDisplayable()) {
                segments.add(s);
            }
        }
    }
    ch.srg.mediaplayer.segment.adapter.BaseSegmentAdapter.notifyDataSetChanged();
}