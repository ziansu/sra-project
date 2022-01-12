@java.lang.Override
public int compare(main.java.addressBook.Person lhs, main.java.addressBook.Person rhs) {
    if (((lhs.getFirstName()) != null) || ((rhs.getFirstName()) != null)) {
        return lhs.getLastName().concat(lhs.getFirstName()).compareTo(rhs.getLastName().concat(rhs.getFirstName()));
    }else {
        return lhs.getLastName().compareTo(rhs.getLastName());
    }
}