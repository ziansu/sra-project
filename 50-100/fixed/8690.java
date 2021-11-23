public static void main(java.lang.String[] args) {
    if ((args.length) < 2) {
        java.lang.System.out.println("Usage: java MusicTransposer music.xml key");
    }
    MusicFile music = new MusicFile(args[0]);
    muaic.transposeTo(KEY.getKeyByNote(NOTE.getNoteByNote(args[1].charAt(0))));
}