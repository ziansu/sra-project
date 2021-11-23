public java.lang.String checkYourSelf(java.lang.String value) {
    int guessValue = java.lang.Integer.parseInt(value);
    java.lang.String result = "miss";
    if (locations.remove(new java.lang.Integer(guessValue))) {
        result = "hit";
    }
    if ((locations.size()) == 0) {
        result = "kill";
    }
    java.lang.System.out.println(result);
    return result;
}