public java.lang.String getLettre() {
    java.lang.System.out.println("Proposez une lettre: ");
    java.util.Scanner saisie = new java.util.Scanner(java.lang.System.in);
    java.lang.String lettre = "";
    do {
        lettre = saisie.nextLine();
    } while (!(this.lettreIsGood(lettre)) );
    this.lettre = lettre;
    return this.lettre;
}