@org.springframework.web.bind.annotation.RequestMapping(value = "/changeInfoSave", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String changeInfo(@org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam(value = "familyName")
java.lang.String family, @org.springframework.web.bind.annotation.RequestParam(value = "oldPassword")
java.lang.String oldPassword, @org.springframework.web.bind.annotation.RequestParam(value = "newPassword")
java.lang.String newPassword, @org.springframework.web.bind.annotation.RequestParam(value = "fatherName")
java.lang.String fatherName, @org.springframework.web.bind.annotation.RequestParam(value = "nationalNumber")
java.lang.Long nationalNumber, @org.springframework.web.bind.annotation.RequestParam(value = "postalCode")
java.lang.Long postalCode, @org.springframework.web.bind.annotation.RequestParam(value = "address")
java.lang.String address, @org.springframework.web.bind.annotation.RequestParam(value = "birthDay")
java.lang.String birthDay, org.springframework.ui.Model model) {
    if (userService.changeInfo(name, family, oldPassword, newPassword, birthDay, fatherName, nationalNumber, postalCode, address)) {
        return "home";
    }
    return "changeInfo";
}