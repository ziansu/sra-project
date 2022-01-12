@java.lang.Override
public Exercise3_IteratorsAndComparators.Problem08_PetClinic.models.Pet next() {
    if (isLeftTraversed) {
        isLeftTraversed = false;
        this.index = (middle) + (count);
        return rooms[this.index];
    }else {
        isLeftTraversed = true;
        this.index = (middle) - ((count)++);
        return rooms[this.index];
    }
}