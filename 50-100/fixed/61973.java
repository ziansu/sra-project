@java.lang.Override
public void onSuccess(com.belatrixsf.allstars.networking.retrofit.responses.SearchEmployeeResponse searchEmployeeResponse) {
    hasNextPage = ((searchEmployeeResponse.getNext()) != null) && (!(searchEmployeeResponse.getNext().isEmpty()));
    if ((currentPage) == 1) {
        employees = searchEmployeeResponse.getEmployeeList();
    }else {
        employees.addAll(searchEmployeeResponse.getEmployeeList());
    }
    view.showContacts(currentPage, employees);
}