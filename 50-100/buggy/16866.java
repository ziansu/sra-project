@cucumber.api.java.en.And(value = "^the student of the proposal titled \"([^\"]*)\" is set to \"([^\"]*)\"$")
public void theStudentOfTheProposalTitledIsSetTo(java.lang.String title, java.lang.String userName) throws java.lang.Throwable {
    cat.udl.eps.entsoftarch.thesismarket.Proposal proposal = proposalRepository.findByTitleContaining(title).get(0);
    cat.udl.eps.entsoftarch.thesismarket.Student student = studentRepository.findOne(userName);
    java.util.Set<cat.udl.eps.entsoftarch.thesismarket.Student> students = new cat.udl.eps.entsoftarch.thesismarket.HashSet();
    students.add(student);
    proposal.setStudents(students);
}