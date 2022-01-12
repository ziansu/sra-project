private void askForRequiredInput(java.lang.String req, java.util.HashMap<java.lang.String, java.lang.String> result) {
    java.lang.System.out.println((("Give required input " + req) + ":"));
    java.lang.String input = reader.nextLine();
    input.replaceAll("\\s", "");
    if (input.equals("")) {
        askForRequiredInput(req, result);
    }else {
        result.put(req, input);
    }
}