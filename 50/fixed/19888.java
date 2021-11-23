protected com.google.common.base.Predicate<java.lang.reflect.Method> getPredicate(org.eclipse.emf.ecore.EObject context, org.eclipse.emf.ecore.EClass type) {
    java.lang.String methodName = "scope_" + (type.getName());
    return PolymorphicDispatcher.Predicates.forName(methodName, 2);
}