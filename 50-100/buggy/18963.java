public void updateExpectedWisdom(int new_found_wisdom) {
    total_wisdom -= new_found_wisdom;
    (total_unknowns)--;
    expected_wisdom = (total_wisdom) / (total_unknowns);
    for (wtr.g2.Person p : people) {
        if (((p.status) == (Person.Status.STRANGER)) && ((p.chatted) == false)) {
            p.remaining_wisdom = expected_wisdom;
        }
    }
}