protected com.google.common.base.Predicate<java.lang.reflect.Method> getPredicate(org.eclipse.emf.ecore.EObject context, org.eclipse.emf.ecore.EReference reference) {
    java.lang.String methodName = (("scope_" + (reference.getEContainingClass().getName())) + "_") + (reference.getName());
    java.lang.System.out.println(methodName);
    return PolymorphicDispatcher.Predicates.forName(methodName, 2);
}