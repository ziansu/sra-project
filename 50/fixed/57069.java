public egenChallenge.User[] output() throws java.lang.ClassNotFoundException {
    return ((egenChallenge.User[]) (egenChallenge.DataParser.jsonToDataArray(data, egenChallenge.User[].class)));
}