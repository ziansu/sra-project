@java.lang.Override
public int compareTo(database.Entry b) {
    return this.getname().toLowerCase().compareTo(b.getname().toLowerCase());
}