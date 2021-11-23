public java.lang.String checkPoint(java.lang.String point) throws com.sekwah.sekcphysics.ragdoll.generation.data.RagdollInvalidDataException {
    if (!(this.pointHashMap.containsKey(point))) {
        throw new com.sekwah.sekcphysics.ragdoll.generation.data.RagdollInvalidDataException("Invalid Skeleton Point Selected");
    }
    return point;
}