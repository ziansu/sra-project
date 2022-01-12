public boolean checkIsCancelRequest() {
    if ((rate.equals(0.0)) && (duration.equals(0))) {
        return true;
    }else {
        return false;
    }
}