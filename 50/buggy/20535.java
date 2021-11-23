public static boolean isValidElement(org.eclipse.jdt.core.IJavaElement element) {
    return ((element != null) && (element.exists())) && (element.getJavaProject().isOnClasspath(element));
}