@java.lang.Override
public void generateBookmark(dna_epigenetics.Polymer polymer) {
    int numOfAtoms = polymer.getNumOfAtoms();
    int index = 0;
    do {
        index += separation;
        for (int i = 0; (i < (blockLength)) && (index < numOfAtoms); i++) {
            polymer.setType(index, type);
            index++;
        }
    } while (index < numOfAtoms );
}