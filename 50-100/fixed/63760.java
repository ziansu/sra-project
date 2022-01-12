public static void tocarMusica(java.util.Scanner s, Player p) {
    java.lang.System.out.println("Introduza o numero da playlist:");
    int playlist = s.nextInt();
    s.nextLine();
    java.lang.System.out.println("Introduza o numero da musica:");
    int musica = s.nextInt();
    s.nextLine();
    try {
        p.tocarMusica(playlist, musica);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
}