@org.springframework.web.bind.annotation.GetMapping(value = "/settingWebsite/banners")
public java.lang.String managementBanner(org.springframework.ui.Model model) {
    java.lang.System.out.println("controller banner");
    model.addAttribute(com.shop.svitnagorod.controller.AdminController.BANNERS, bannerService.findAll());
    model.addAttribute(com.shop.svitnagorod.controller.AdminController.BANNER, new com.shop.svitnagorod.DTO.BannerDTO());
    return "managementBanners";
}