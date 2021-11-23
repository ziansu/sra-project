public static void registerSubtypes(com.fasterxml.jackson.databind.jsontype.NamedType... namedTypes) {
    org.cripac.isee.vpe.util.JsonHelper.globalMapper.registerSubtypes(namedTypes);
    for (com.fasterxml.jackson.databind.jsontype.NamedType namedType : namedTypes) {
        org.cripac.isee.vpe.util.JsonHelper.registeredTypes.add(namedType.getName());
    }
}