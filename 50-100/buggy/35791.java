@org.junit.Test
public void getModelRedirectModel() {
    org.springframework.ui.ModelMap redirectModel = new org.springframework.ui.ModelMap("name", "redirectValue");
    this.mavContainer.setRedirectModel(redirectModel);
    this.mavContainer.addAttribute("name", "value");
    org.junit.Assert.assertEquals("Default model should be used if not in redirect scenario", "value", this.mavContainer.getModel().get("name"));
    this.mavContainer.setRedirectModelScenario(true);
    org.junit.Assert.assertEquals("Redirect model should be used in redirect scenario", "redirectValue", this.mavContainer.getModel().get("name"));
}