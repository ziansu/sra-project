private java.lang.String nameFor(java.lang.Class<?> type) {
    java.lang.String typeName = type.getName();
    if ((typeName.startsWith("java.")) || (((type.getPackage()) != null) && (type.getPackage().isSealed()))) {
        typeName = "codegen." + typeName;
    }
    return java.lang.String.format("%s$%s$%d", typeName, "MockitoMock", java.lang.Math.abs(random.nextInt()));
}