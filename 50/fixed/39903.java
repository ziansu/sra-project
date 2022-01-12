@java.lang.Override
public void onClick(android.view.View v) {
    if (isNewClaim == true) {
        createDestinationButton(isNewClaim, Destination, newDestination, doNothing);
    }else {
        Destination = claim.getDestination();
        createDestinationButton(isNewClaim, Destination, newDestination, doNothing);
    }
}