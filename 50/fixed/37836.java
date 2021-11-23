@org.springframework.web.bind.annotation.GetMapping(value = "/dashboard")
public java.lang.String getDashboardPage(org.springframework.ui.Model model) {
    model.addAttribute("parcelForm", new by.epam.jmp.app.tradesystem.web.dto.ParcelFormDTO());
    return by.epam.jmp.app.tradesystem.web.DeliveryController.path("/dashboard");
}