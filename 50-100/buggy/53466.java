public void destroy() {
    if ((armature) != null)
        armature.destroy();
    
    for (com.samrj.devil.graphics.model.Mesh mesh : meshes)
        mesh.destroy();
    
    java.util.Arrays.fill(actions, null);
    java.util.Arrays.fill(meshes, null);
    actionIndices.clear();
    meshIndices.clear();
}