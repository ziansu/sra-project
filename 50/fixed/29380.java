@java.lang.Override
public void addFront(com.flowpowered.math.vector.Vector3i vector) {
    vector3iTuple[0] = vector;
    currentCapacity = 1 + ((vector3iTuple[1]) == null ? 0 : 1);
}