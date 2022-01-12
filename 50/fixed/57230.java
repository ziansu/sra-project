public java.lang.Boolean isPillStillAvailable(int pillIndex) {
    if (po) {
        if (!(isNodeObservable(pillIndex))) {
            return null;
        }
    }
    return pills.get(pillIndex);
}