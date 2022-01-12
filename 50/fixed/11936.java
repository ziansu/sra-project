public static void main(java.lang.String[] args) {
    java.util.logging.Logger.getLogger("com.jme3").setLevel(java.util.logging.Level.WARNING);
    java.awt.EventQueue.invokeLater(() -> {
        org.multiverseking.editor.core.MultiverseEditor app = new org.multiverseking.editor.core.MultiverseEditor("King Of Multiverse Editor");
    });
}