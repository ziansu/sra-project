void revert() {
    if (this.alreadySaved) {
        if (this.horizontalChange) {
            this.minX = this.oldMinX;
            this.maxX = this.oldMaxX;
            this.horizontalChange = false;
        }
        if (this.verticalChange) {
            this.minY = this.oldMinY;
            this.maxY = this.oldMaxY;
            this.verticalChange = false;
        }
        this.alreadySaved = false;
    }
}