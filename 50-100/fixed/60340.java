private void setMap() {
    java.lang.String configPath = nextLine();
    engine.ValidationState validationState = world.setMap(configPath);
    if (validationState.equals(ValidationState.VALID)) {
        out.println("Map set successfully!");
    }else {
        out.println(validationState);
    }
}