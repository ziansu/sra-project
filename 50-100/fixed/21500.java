private org.lwjgl.util.vector.Vector3f calculateOrigin(short boneBinding, boolean offset) {
    org.lwjgl.util.vector.Vector3f o = new org.lwjgl.util.vector.Vector3f();
    com.lost.blocks.Skeletalizer.Bone bone = skeleton.getBone(boneBinding);
    bone.getPosition(o);
    if (offset)
        o.x -= 1.0F;
    
    o.y = -(o.y);
    o.z = -(o.z);
    return o;
}