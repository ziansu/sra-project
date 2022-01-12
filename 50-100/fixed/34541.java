public void park() {
    if ((positionStatus.empty) == true) {
        reverse();
        isParked = true;
    }else {
        while ((positionStatus.position) < 500) {
            if ((moveForward().empty) == true) {
                reverse();
                isParked = true;
            }
        } 
    }
}