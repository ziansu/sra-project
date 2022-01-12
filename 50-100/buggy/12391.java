public boolean isValidMove(java.lang.String direction) {
    switch (direction.toLowerCase()) {
        case "n" :
            return (this.emptySpaceLocation.getX()) > 0;
        case "e" :
            return (this.emptySpaceLocation.getX()) < 2;
        case "s" :
            return (this.emptySpaceLocation.getY()) < 2;
        case "w" :
            return (this.emptySpaceLocation.getY()) > 0;
        default :
            return false;
    }
}