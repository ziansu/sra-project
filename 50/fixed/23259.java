@org.springframework.web.bind.annotation.RequestMapping(value = "/listPolicies", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String loadListPolicies(@org.springframework.web.bind.annotation.ModelAttribute(value = "userLocal")
it.estia.entity.User userLocal, org.springframework.ui.Model model) {
    java.util.List<it.estia.entity.Policy> listPolicies = policyService.getPolicyList(userLocal);
    model.addAttribute("listPoliciesAttribute", listPolicies);
    java.lang.String view = "listPolicies";
    return view;
}