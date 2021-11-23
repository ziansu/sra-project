private Model.Regex.Construct processSingle() {
    if ((singleChars.size()) == 1) {
        return singleChars.get(0);
    }else {
        return combine(singleChars);
    }
}