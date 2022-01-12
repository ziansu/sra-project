public java.util.ArrayList<org.debugger.tutorial.Book> getBooksForPerson(org.debugger.tutorial.Person p1) {
    java.util.ArrayList<org.debugger.tutorial.Book> result = new java.util.ArrayList<org.debugger.tutorial.Book>();
    for (org.debugger.tutorial.Book aBook : this.getBooks()) {
        if (aBook.getPerson().getName().equals(p1.getName())) {
            result.add(aBook);
        }
    }
    return result;
}