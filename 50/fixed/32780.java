@org.springframework.web.bind.annotation.PostMapping(value = "/merchant/add")
public java.lang.String addNewMerchant(@javax.validation.Valid
com.capstone_project.models.Merchant merchant) {
    merchantRepo.save(merchant);
    return "redirect:/home";
}