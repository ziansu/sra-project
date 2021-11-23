public static boolean isInputComponent(org.sbolstandard.core2.FunctionalComponent comp) {
    java.lang.System.out.println(comp.getIdentity());
    return comp.getDirection().equals(DirectionType.IN);
}