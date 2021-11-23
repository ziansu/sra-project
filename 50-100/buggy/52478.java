public boolean putGroup(int groupPosition, long groupId, boolean isChecked) {
    if (hasStableIds()) {
        java.lang.Integer result = (isChecked) ? groupIds.put(groupId, groupPosition) : groupIds.remove(groupId);
        return result != null;
    }else {
        return isChecked ? groupPositions.add(groupPosition) : groupPositions.remove(groupPosition);
    }
}