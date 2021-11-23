private boolean isAFinalProvisioningState(java.lang.String state) {
    switch (state.ToLower()) {
        case "succeeded" :
        case "canceled" :
        case "failed" :
            return true;
        default :
            return false;
    }
}