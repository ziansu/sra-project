@com.gearservice.controller.RequestMapping(value = "/api/autocomplete/{itemName}/{searchText:.+}", method = RequestMethod.GET)
public java.util.List<java.lang.String> autocompleteData(@com.gearservice.controller.PathVariable(value = "itemName")
java.lang.String itemName, @com.gearservice.controller.PathVariable(value = "searchText")
java.lang.String searchText) {
    java.lang.System.out.println(searchText);
    return applicationService.getAutocompleteData(itemName, searchText);
}