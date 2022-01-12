@org.springframework.web.bind.annotation.GetMapping(value = "/suppliers_entries_new")
public java.lang.String suppliersEntriesNew(org.springframework.ui.Model model) {
    model.addAttribute("suppliersEntries", new com.gh.gov.ns.model.SuppliersEntries());
    model.addAttribute("institutions", institutionRepository.getAllInstitutions());
    return "suppliers_entries_new";
}