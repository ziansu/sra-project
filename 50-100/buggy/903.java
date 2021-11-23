@java.lang.Override
public java.lang.String toString() {
    java.lang.String str = ("Fitness: " + (this.getFitness())) + " - ";
    str += java.lang.String.valueOf(this.value[0]);
    for (int i = 1; i < (value.length); i++) {
        str += ":" + (this.value[i]);
    }
    return str;
}