public static de.tEngine.math.Quaternion fromEulerRotation(de.tEngine.math.Vector3f euler) {
    de.tEngine.math.Quaternion rot = de.tEngine.math.Quaternion.fromAxisAngle(new de.tEngine.math.Vector3f(0, 0, 1), euler.z);
    rot = de.tEngine.math.Quaternion.mul(rot, de.tEngine.math.Quaternion.fromAxisAngle(new de.tEngine.math.Vector3f(1, 0, 0), euler.x));
    rot = de.tEngine.math.Quaternion.mul(rot, de.tEngine.math.Quaternion.fromAxisAngle(new de.tEngine.math.Vector3f(0, 1, 0), euler.y));
    return rot;
}