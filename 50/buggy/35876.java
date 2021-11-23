@java.lang.Override
public boolean add(practice_3.Human human) {
    boolean result = false;
    if ((!((size()) > (patientsMaxCount))) && (super.add(human))) {
        result = true;
    }
    return result;
}