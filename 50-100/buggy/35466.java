private java.lang.String createSearchString() {
    java.lang.String searchString = null;
    if ((choiceBox.getValue()) == "Select pilots with hours between two bounds") {
        searchString = ((("Select * from PILOT, FLOWN_BY WHERE PILOT.Pilot_ID = FLOWN_BY.Pilot_ID AND HOURS BETWEEN " + (numberField1.getText())) + " AND ") + (numberField2.getText())) + ";";
    }
    return searchString;
}