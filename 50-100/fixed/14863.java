static void injectFromBundle(java.lang.Object target) {
    if ((com.hannesdorfmann.fragmentargs.FragmentArgs.autoMappingInjector) == null) {
        try {
            java.lang.Class<?> c = java.lang.Class.forName(com.hannesdorfmann.fragmentargs.FragmentArgs.AUTO_MAPPING_QUALIFIED_CLASS);
            com.hannesdorfmann.fragmentargs.FragmentArgs.autoMappingInjector = ((com.hannesdorfmann.fragmentargs.FragmentArgsInjector) (c.newInstance()));
        } catch (java.lang.Exception e) {
        }
    }
    if ((com.hannesdorfmann.fragmentargs.FragmentArgs.autoMappingInjector) != null) {
        com.hannesdorfmann.fragmentargs.FragmentArgs.autoMappingInjector.inject(target);
    }
}