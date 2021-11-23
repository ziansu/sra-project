@java.lang.Override
public int compareTo(java.lang.Object t) {
    if (!(t instanceof org.betaomega.finalmaveninvitationfx.Person)) {
        return 0;
    }else {
        org.betaomega.finalmaveninvitationfx.Person p = ((org.betaomega.finalmaveninvitationfx.Person) (t));
        return this.getEmail().compareTo(p.getEmail());
    }
}