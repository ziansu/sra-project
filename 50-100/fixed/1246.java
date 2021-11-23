private static void option4() {
    java.lang.System.out.println((((source.pendu.LSD.getString("pen_opt4_msg1")) + (source.pendu.LSD.getString("pen_opt4_msg2"))) + (source.pendu.LSD.getString("pen_opt4_msg3"))));
    byte choix = 0;
    do {
        choix = fichier.InOut.getByte();
    } while ((choix != 1) && (choix != 2) );
    source.Dico.setChoixDico(choix);
}