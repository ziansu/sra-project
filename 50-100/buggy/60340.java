private void setMap() {
    java.lang.String configPath = scanner.nextLine();
    engine.ValidationState validationState = world.setMap(configPath);
    if (validationState.equals(ValidationState.VALID)) {
        out.println("Map set successfully!");
    }else {
        out.println(validationState);
    }
}