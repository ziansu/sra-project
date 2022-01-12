public project.CodeExchangeRequest findByTitle(java.lang.String title) {
    project.CodeExchangeRequest tempSubmission = null;
    for (int i = 0; i < (requests.size()); i++) {
        if (requests.get(i).getTitle().equals(title)) {
            tempSubmission = requests.get(i);
            return tempSubmission;
        }
    }
    if (tempSubmission == null) {
        java.lang.System.out.println("Submission doesn't exist!");
    }
    return tempSubmission;
}