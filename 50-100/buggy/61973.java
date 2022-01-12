@java.lang.Override
public void onSuccess(com.belatrixsf.allstars.networking.retrofit.responses.SearchEmployeeResponse searchEmployeeResponse) {
    hasNextPage = ((searchEmployeeResponse.getNext()) != null) && (!(searchEmployeeResponse.getNext().isEmpty()));
    boolean isFirstPage = (currentPage) == 1;
    if (isFirstPage) {
        employees = searchEmployeeResponse.getEmployeeList();
    }else {
        employees.addAll(searchEmployeeResponse.getEmployeeList());
    }
    view.showContacts(currentPage, employees);
}