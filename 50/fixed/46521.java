@java.lang.Override
public int compare(data.Person o1, data.Person o2) {
    if ((java.lang.Integer.compare(o1.getAge(), o2.getAge())) < 0) {
        return -1;
    }else {
        return 1;
    }
}