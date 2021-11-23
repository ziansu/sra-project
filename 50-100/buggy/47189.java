public void initState(dna_epigenetics.LAMMPSIO lammps) {
    for (int i = 0; i < (n); i++) {
        int s = (lammps.getAtomType(i)) - 1;
        dna[i] = s;
        (numInState[s])++;
        java.lang.System.out.printf("%d ", s);
    }
    java.lang.System.out.printf("\n");
}