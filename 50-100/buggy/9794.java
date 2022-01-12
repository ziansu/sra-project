public static boolean matchTypes(com.jetbrains.ther.typing.types.TheRType type, com.jetbrains.ther.typing.types.TheRType replacementType) {
    if (type instanceof com.jetbrains.ther.typing.types.TheRUnionType) {
        return ((com.jetbrains.ther.typing.types.TheRUnionType) (type)).contains(replacementType);
    }
    return (type.equals(replacementType)) || (com.jetbrains.ther.typing.TheRTypeProvider.isSubtype(type, replacementType));
}