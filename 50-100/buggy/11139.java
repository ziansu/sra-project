@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<java.lang.Class<? extends com.audacious_software.passive_data_kit.generators.Generator>> activeGenerators() {
    java.util.ArrayList<java.lang.Class<? extends com.audacious_software.passive_data_kit.generators.Generator>> active = new java.util.ArrayList<>();
    for (java.lang.String className : this.mActiveGenerators) {
        try {
            active.add(((java.lang.Class<? extends com.audacious_software.passive_data_kit.generators.Generator>) (java.lang.Class.forName(className))));
        } catch (java.lang.ClassNotFoundException e) {
        }
    }
    return active;
}