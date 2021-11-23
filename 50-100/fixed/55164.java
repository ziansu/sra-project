@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder output = new java.lang.StringBuilder();
    for (int i = 0; i < (this.roomCount); i++) {
        Exercise3_IteratorsAndComparators.Problem08_PetClinic.models.Pet pet = rooms[i];
        if (pet == null) {
            output.append("null");
        }else {
            output.append(pet.toString());
        }
        output.append("\n");
    }
    return output.toString();
}