@org.androidannotations.annotations.Background
void getProblemsAsync(int page) {
    java.util.List<com.person.sykim.problembank.bank.jungol.Problem> problems = baekJoon.getProblems(page);
    if (page == (currentPage)) {
        updateProblemsUi(problems);
    }else
        if (page > (currentPage)) {
            insertProblemsUi(problems);
        }
    
    currentPage = page;
}