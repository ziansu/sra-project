public void park(autoParker.AutoParkImpl.PositionStatus positionStatus) {
    if ((positionStatus.empty) == true) {
        reverse();
        isParked = true;
    }else {
        while ((positionStatus.position) < 500) {
            if ((moveForward(positionStatus).empty) == true) {
                reverse();
                isParked = true;
            }
        } 
    }
}