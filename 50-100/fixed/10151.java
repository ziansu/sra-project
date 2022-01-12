@java.lang.Override
public org.eclipse.titan.runtime.core.TitanBoolean isBound() {
    for (int i = 0; i < (array_size); ++i) {
        if (array_elements.get(i).isBound().getValue()) {
            return new org.eclipse.titan.runtime.core.TitanBoolean(true);
        }
    }
    return new org.eclipse.titan.runtime.core.TitanBoolean(false);
}