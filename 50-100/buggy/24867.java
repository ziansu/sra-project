@org.androidannotations.annotations.Background
void getProblemsAsync(int page) {
    if (page == (currentPage)) {
        java.util.List<com.person.sykim.problembank.bank.jungol.Problem> problems = baekJoon.getProblems(page);
        updateProblemsUi(problems);
    }else
        if (page > (currentPage)) {
            java.util.List<com.person.sykim.problembank.bank.jungol.Problem> problems = baekJoon.getProblems(page);
            insertProblemsUi(problems);
        }
    
}