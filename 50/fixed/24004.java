private Model.Regex.Construct processSingle() {
    if ((singleChars.size()) == 1) {
        return singleChars.get(0);
    }else {
        java.lang.System.out.println(singleChars);
        return combine(singleChars);
    }
}