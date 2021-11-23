public int compare(org.lwjgl.util.vector.Vector2f a, org.lwjgl.util.vector.Vector2f b) {
    float lengthA = org.lwjgl.util.vector.Vector2f.sub(a, currentNode.getPoint(), null).length();
    float lengthB = org.lwjgl.util.vector.Vector2f.sub(b, currentNode.getPoint(), null).length();
    int result = java.lang.Float.compare(lengthA, lengthB);
    return result;
}