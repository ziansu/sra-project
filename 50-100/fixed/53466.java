public void destroy() {
    if ((armature) != null) {
        armature.destroy();
        java.util.Arrays.fill(actions, null);
        actionIndices.clear();
    }
    for (com.samrj.devil.graphics.model.Mesh mesh : meshes)
        mesh.destroy();
    
    java.util.Arrays.fill(meshes, null);
    meshIndices.clear();
}