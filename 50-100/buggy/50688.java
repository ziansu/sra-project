private int problemsInfoRead() throws java.io.IOException {
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(ru.ifmo.acm.backend.Preparation.openAuthorizedStream(problemsInfoURL, login, password)));
    int problems = 0;
    java.lang.String line;
    while ((line = br.readLine()) != null) {
        if (!(line.contains("letter"))) {
            problems++;
        }
    } 
    return problems;
}