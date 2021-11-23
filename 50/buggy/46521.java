@java.lang.Override
public int compare(data.Person o1, data.Person o2) {
    if ((o1.getAge()) < (o2.getAge())) {
        return -1;
    }else {
        return 1;
    }
}