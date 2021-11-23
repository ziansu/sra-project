@java.lang.Override
public int compare(com.example.mitsichury.firstwebservicegetinformation.Header lhs, com.example.mitsichury.firstwebservicegetinformation.Header rhs) {
    return lhs.getDateParution().before(rhs.getDateParution()) ? -1 : 1;
}