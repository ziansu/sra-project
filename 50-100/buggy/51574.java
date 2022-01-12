public int mapPosition(int position) {
    if ((this.namePositionMap) != null) {
        if (position < (this.namePositionMap.length)) {
            return this.namePositionMap[position];
        }else {
            return this.namePositionMap[((this.namePositionMap.length) - 1)];
        }
    }else {
        if (position < (this.name.length())) {
            return position;
        }else {
            return this.name.length();
        }
    }
}