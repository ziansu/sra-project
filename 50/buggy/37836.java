@org.springframework.web.bind.annotation.GetMapping(value = "/dashboard")
public java.lang.String getDashboardPage(org.springframework.ui.Model model, by.epam.jmp.app.tradesystem.web.dto.ParcelFormDTO parcelFormDTO) {
    by.epam.jmp.app.tradesystem.web.DeliveryController.log.debug("Try to populate parcelFormDTO: {}. If it is valid.", parcelFormDTO);
    model.addAttribute("parcelForm", (parcelFormDTO != null ? parcelFormDTO : new by.epam.jmp.app.tradesystem.web.dto.ParcelFormDTO()));
    return by.epam.jmp.app.tradesystem.web.DeliveryController.path("/dashboard");
}