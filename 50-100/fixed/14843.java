@main.java.CarPackage.RequestMapping(value = "/specialService", method = RequestMethod.POST, params = "clientSpecialAction=specialService")
public java.lang.String additionalService(@javax.validation.Valid
@main.java.CarPackage.ModelAttribute
main.java.CarPackage.Commission commission, org.springframework.ui.Model model) {
    model.addAttribute("partsType", java.util.Arrays.asList(java.util.Arrays.stream(main.java.CarPackage.TypePart.values()).map(TypePart::name).toArray(java.lang.String[]::new)));
    model.addAttribute("commission", commission);
    return "AdditionalService";
}