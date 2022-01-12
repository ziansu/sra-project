public void parseProperties(java.lang.String line) {
    java.lang.String[] propertyPair = line.split(":");
    switch (propertyPair[0]) {
        case "On Round" :
            roundNumber = java.lang.Integer.parseInt(propertyPair[1]);
            break;
        case "numberOfRounds" :
            numberOfRounds = java.lang.Integer.parseInt(propertyPair[1]);
            break;
        default :
            break;
    }
}