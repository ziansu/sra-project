public static boolean isInputComponent(org.sbolstandard.core2.FunctionalComponent comp) {
    return comp.getDirection().equals(DirectionType.IN);
}