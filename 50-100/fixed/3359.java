public void checkMovement6Started() {
    if (((((dStartToBox) - (((dStartToBackStepBoard) - (dStartToFrontStepBoard)) / (dStartToBox))) + (dTrackMargin)) > (dCompletion)) && ((dCompletion) > ((((dStartToBox) - ((dStartToBackStepBoard) - (dStartToFrontStepBoard))) / (dStartToBox)) - (dTrackMargin)))) {
        bMovement6Started = true;
    }
}