@org.junit.Test
public void find_most_recent_list() {
    commandBox.runCommand("list all");
    assertFindResult("find t/Dentist", td.dentistAppointment);
    commandBox.runCommand("list upcoming");
    assertFindResult("find t/Dentist");
    commandBox.runCommand("list overdue");
    assertFindResult("find t/Dentist", td.dentistAppointment);
    commandBox.runCommand("list incomplete");
    assertFindResult("find t/Work t/Difficult", td.bossEmail, td.homework, td.handleCustomerComplaints);
    commandBox.runCommand("list complete");
    assertFindResult("find t/Work t/Difficult");
}