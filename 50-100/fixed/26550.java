public void joue() {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    mJoueurCourant = (((mCoupsJoues) % 2) == 0) ? 0 : 1;
    java.lang.System.out.println(("mJoueurCourant" + (mJoueurCourant)));
    mPlateau.addJeton(mJoueurs[mJoueurCourant].getColonne(), mJoueurCourant);
    (mCoupsJoues)++;
}