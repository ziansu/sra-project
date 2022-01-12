public java.util.Set<build.pluto.BuildUnit<?>> getModuleDependencies() {
    if ((requiredUnits) == null) {
        requiredUnits = new java.util.HashSet<>();
        for (build.pluto.dependency.Requirement req : requirements)
            if (req instanceof build.pluto.dependency.BuildRequirement)
                if ((((build.pluto.dependency.BuildRequirement<?>) (req)).getUnit()) != null) {
                    requiredUnits.add(((build.pluto.dependency.BuildRequirement<?>) (req)).getUnit());
                }
            
        
    }
    return requiredUnits;
}