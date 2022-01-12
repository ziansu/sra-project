private int[] getAllColumns(int columnIndex) {
    int[][] colGroups = segmentProperties.getColumnGroups();
    for (int i = 0; i < (colGroups.length); i++) {
        if (org.apache.carbondata.core.scan.executor.util.QueryUtil.searchInArray(colGroups[i], columnIndex)) {
            return colGroups[i];
        }
    }
    return new int[0];
}