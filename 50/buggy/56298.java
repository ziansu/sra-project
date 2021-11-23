public boolean hasPoint(int index) {
    return ((!(this.points.isEmpty())) && (index >= 0)) && (index < ((this.points.size()) - 1));
}