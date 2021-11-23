public boolean AreaAdjacency(int area2) {
    java.lang.String[] adjAreas = this.AdjArea.split(",");
    for (java.lang.String s : adjAreas) {
        if (s == (java.lang.Integer.toString(area2))) {
            return true;
        }
    }
    return false;
}