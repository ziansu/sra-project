@java.lang.Override
public void addBack(com.flowpowered.math.vector.Vector3i vector) {
    vector3iTuple[1] = vector;
    currentCapacity = 1 + ((vector3iTuple[0]) == null ? 0 : 1);
}