@java.lang.Override
public int compareTo(minijava.Fitness fitness) {
    int compare = java.lang.Integer.compare(difference, fitness.difference);
    if (compare == 0) {
        compare = java.lang.Long.compare(speed, fitness.speed);
        if (compare == 0) {
            compare = java.lang.Integer.compare(size, fitness.size);
        }
    }
    return compare;
}