@org.junit.Test
public void list_nonEmptyList() {
    assertListResult("list all", td.assignment, td.gym, td.gym2, td.gym3, td.cs2103, td.date, td.study);
    assertListResult("list personal", td.gym, td.gym2, td.gym3, td.date);
    assertListResult("list study", td.assignment);
    assertListResult("list favorite", td.assignment, td.gym, td.cs2103, td.study);
    assertListResult("list favorite study", td.assignment);
    assertListResult("list favorite personal", td.gym, td.gym2, td.gym3, td.date);
}