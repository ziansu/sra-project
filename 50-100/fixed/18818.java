public static void main(java.lang.String[] args) {
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            gui aGui = new gui();
        }
    });
    artpeggio.musical = new musicPlayer();
    artpeggio.ArtInterface.setVisible(true);
    javax.sound.sampled.AudioPermission permission = new javax.sound.sampled.AudioPermission("permission", "play");
    java.lang.String filepath = "artpeggio/resources/drawables/ex02.jpg";
}