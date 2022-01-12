@org.springframework.web.bind.annotation.RequestMapping(value = { "/addPost" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String doPostToGroup(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.ModelAttribute
vms.models.postenvironment.Post post, @org.springframework.web.bind.annotation.RequestParam(value = "title")
java.lang.String title, @org.springframework.web.bind.annotation.RequestParam(value = "owner")
java.lang.String owner, @org.springframework.web.bind.annotation.RequestParam(value = "district")
java.lang.String district, @org.springframework.web.bind.annotation.RequestParam(value = "price")
java.lang.String price, @org.springframework.web.bind.annotation.RequestParam(value = "textOnView")
java.lang.String textOnView, @org.springframework.web.bind.annotation.RequestParam(value = "adress")
java.lang.String adress, @org.springframework.web.bind.annotation.RequestParam(value = "contact")
java.lang.String contact, @org.springframework.web.bind.annotation.RequestParam(value = "info")
java.lang.String info) {
    vms.models.postenvironment.Post postToGroup = new vms.models.postenvironment.Post(title, owner, district, price, textOnView, adress, contact, info);
    java.lang.String result = postToGroupService.postToGroup(ConstantsForVkApi.ID_GROUP, postToGroup);
    if (result != null) {
        return "redirect:/post/?postInGroupSuccess";
    }
    return "redirect:/post/?postInGroupDanger";
}