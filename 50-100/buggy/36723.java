@org.springframework.web.bind.annotation.RequestMapping(value = uk.ac.ebi.metabolights.controller.WSSearchController.MY_SUBMISSIONS)
public org.springframework.web.servlet.ModelAndView MySubmissionsSearch(javax.servlet.http.HttpServletRequest request) {
    uk.ac.ebi.metabolights.search.service.SearchQuery query = getQuery(request);
    uk.ac.ebi.metabolights.model.MetabolightsUser user = uk.ac.ebi.metabolights.controller.LoginController.getLoggedUser();
    java.util.Map.Entry userFilter = new java.util.AbstractMap.SimpleEntry(uk.ac.ebi.metabolights.controller.WSSearchController.USERS_FULL_NAME, new java.lang.String[]{ user.getFullName() });
    populateFacet(query, userFilter);
    org.springframework.web.servlet.ModelAndView mav = internalSearch(uk.ac.ebi.metabolights.controller.WSSearchController.MY_SUBMISSIONS, query, null);
    return mav;
}