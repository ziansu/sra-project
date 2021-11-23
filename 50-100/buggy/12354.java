public boolean putChild(int groupPosition, int childPosition, long childId, boolean isChecked) {
    long packedPosition = android.widget.ExpandableListView.getPackedPositionForChild(groupPosition, childPosition);
    if (hasStableIds()) {
        java.lang.Long result = (isChecked) ? childIds.put(childId, packedPosition) : childIds.remove(childId);
        return result != null;
    }else {
        return isChecked ? childPositions.add(packedPosition) : childPositions.remove(packedPosition);
    }
}