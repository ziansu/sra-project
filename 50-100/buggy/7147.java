@java.lang.SuppressWarnings(value = "unchecked")
@javax.annotation.Nullable
@java.lang.Override
public <T extends com.github.rinde.rinsim.core.model.Model<?>> T tryGetModel(java.lang.Class<T> clazz) {
    for (final com.github.rinde.rinsim.core.model.Model<?> model : registry.values()) {
        if (clazz.isInstance(model)) {
            return ((T) (model));
        }
    }
    throw new java.lang.IllegalArgumentException(("There is no model of type: " + clazz));
}