private void setUserValueToForm(org.springframework.ui.Model model, com.tasktoys.archelon.data.entity.User user) {
    java.util.Map<java.lang.String, java.lang.String> map = user.toSecureMap();
    for (java.lang.String key : map.keySet()) {
        if (key.equals("birthdate")) {
            model.addAttribute(((com.tasktoys.archelon.controller.UsersettingController.CULLENT_VALUE_PREFIX) + key), decrementMonth(map.get(key)));
        }else {
            model.addAttribute(((com.tasktoys.archelon.controller.UsersettingController.CULLENT_VALUE_PREFIX) + key), map.get(key));
        }
    }
}