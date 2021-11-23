void add(Kubaner.Logic.Subject subject) {
    for (int i = 0; i < (size()); i++) {
        if ((subjects.get(i).getName().compareTo(subject.getName())) >= 1) {
            subjects.add(i, subject);
            return ;
        }
    }
    subjects.add(subject);
}