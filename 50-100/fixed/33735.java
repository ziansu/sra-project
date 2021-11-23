@java.lang.Override
public int compareTo(minijava.Fitness fitness) {
    int compare = java.lang.Integer.compare(difference, fitness.difference);
    if (compare == 0) {
        compare = java.lang.Integer.compare(size, fitness.size);
        if (compare == 0) {
            compare = java.lang.Long.compare(speed, fitness.speed);
        }
    }
    return compare;
}