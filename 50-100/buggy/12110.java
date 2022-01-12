private datastructures.BugSummary handleBugSummary() {
    datastructures.BugSummary summary = new datastructures.BugSummary();
    try {
        while (reader.hasNext()) {
            if ((reader.next()) == (javax.xml.stream.events.XMLEvent.START_ELEMENT)) {
                if (reader.getLocalName().equals(Constants.BUG_CATEGORY)) {
                    summary.add(handleBugCategory());
                }
            }else {
                if (isEndElement(Constants.BUG_SUMMARY)) {
                    break;
                }
            }
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return summary;
}