@java.lang.Override
public void generateBookmark(dna_epigenetics.Polymer polymer) {
    int numOfAtoms = polymer.getNumOfAtoms();
    int index = 0;
    do {
        index += separation;
        for (int i = index; (i < (index + (blockLength))) || (i < numOfAtoms); i++) {
            polymer.setType(index, type);
        }
    } while (index < numOfAtoms );
}