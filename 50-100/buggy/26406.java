private boolean isDifferent(java.util.List<java.lang.String> newAcrList, java.util.List<java.lang.String> previousAcrList) {
    if ((previousAcrList == null) || ((previousAcrList.size()) != (newAcrList.size()))) {
        return true;
    }
    return newAcrList.get(0).equals(previousAcrList.get(0));
}