@butterknife.OnClick(value = R.id.panel_longest_distance)
void onLongestDistanceClick() {
    if ((longestDistanceEvent) != null)
        startEvent(longestDistanceEvent.getId());
    
}