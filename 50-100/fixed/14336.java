private void setConfig() {
    boolean problem = true;
    while (problem) {
        try {
            java.lang.String configPath = nextLine();
            engine.ValidationState validationState = world.setConfig(configPath);
            if (validationState.equals(ValidationState.VALID)) {
                out.println("Config set successfully!");
            }else {
                out.println(validationState);
            }
        } catch (java.lang.Exception ex) {
            problem = true;
        }
    } 
}