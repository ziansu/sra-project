private static int choix2Jr() {
    byte choix = 0;
    do {
        java.lang.System.out.println(source.pendu.LSD.getString("pen_choix2JR_msg1"));
        java.lang.System.out.println(source.pendu.LSD.getString("pen_choix2JR_msg2"));
        java.lang.System.out.println(source.pendu.LSD.getString("pen_choix2JR_msg3"));
        choix = fichier.InOut.getByte();
        switch (choix) {
            case 1 :
                return source.pendu.UnJoueur();
            case 2 :
                return source.pendu.DeuxJoueur();
        }
    } while (choix != 3 );
    return 0;
}