private void cleanup() {
    com.badlogic.gdx.backends.lwjgl3.Lwjgl3Cursor.disposeSystemCursors();
    if ((audio) instanceof com.badlogic.gdx.backends.lwjgl3.audio.OpenALAudio) {
        ((com.badlogic.gdx.backends.lwjgl3.audio.OpenALAudio) (audio)).dispose();
    }
    com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application.errorCallback.free();
    com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application.errorCallback = null;
    if ((com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application.glDebugCallback) != null) {
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application.glDebugCallback.free();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application.glDebugCallback = null;
    }
    org.lwjgl.glfw.GLFW.glfwTerminate();
}