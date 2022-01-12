public java.lang.String getModifier() {
    for (java.lang.String mod : modifiers) {
        if (mod.contains("final")) {
            return "final-";
        }
    }
    return "";
}