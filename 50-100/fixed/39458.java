public company.basicService retrieveService() {
    java.lang.String procedure = null;
    java.lang.System.out.println("Enter the name of the procedure to search for");
    procedure = input.nextLine();
    company.basicService searchedService = null;
    company.basicService traverse = head;
    int result = retrieveService(procedure, searchedService, traverse);
    if (result != 0) {
        return searchedService;
    }
    java.lang.System.out.println("That procedure couldn't be found in the patients history");
    return null;
}