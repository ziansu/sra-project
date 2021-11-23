public boolean stopBasicallyMatches(com.remulasce.lametroapp.java_core.basic_types.Stop a, com.remulasce.lametroapp.java_core.basic_types.Stop b) {
    if (a == b) {
        return true;
    }
    if ((a.getAgency()) == (b.getAgency())) {
        return true;
    }
    return (a.getAgency().equals(b.getAgency())) && (a.getStopID().equals(b.getStopID()));
}